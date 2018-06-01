package id.brainmaster.iso20022.controller;

import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.entity.TransactionKey;
import id.brainmaster.iso20022.model.*;
import id.brainmaster.iso20022.model.response.CreditTransferTransaction30Status;
import id.brainmaster.iso20022.model.response.GenericSingleRestResponse;
import id.brainmaster.iso20022.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.query.CassandraPageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.StringReader;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController("/transaction")
public class TransactionController {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionController.class);
    private static final String TOPUP_FOR_ACCOUNT_SYNC = "/topup/{accountId}";
    private static final String TOPUP_FOR_ACCOUNT_ASYNC = TOPUP_FOR_ACCOUNT_SYNC + "/async";

    @Autowired
    private TransactionService service;

    @Autowired
    private JAXBContext context;

    private GenericSingleRestResponse history(final Document document, final String accountId,
            final GenericSingleRestResponse genericSingleRestResponse,
            final Date startDate, final Date endDate, final Pageable pageable) {
        //TODO: change the implementation
//        service.getTransactionHistoryByCustomer(accountId, startDate, endDate, pageable).stream().forEach(transaction -> );
        return null;
    }

    private Document preparePaymentStatusReportDocumentWithoutStatus(final Document document) throws DatatypeConfigurationException {
        //Transaction status will be set during saving document to database
        Document responseDocument = new Document();
        FIToFICustomerCreditTransferV07 customerCreditTransfer = document.getFIToFICstmrCdtTrf();
        FIToFIPaymentStatusReportV09 paymentStatusReport = new FIToFIPaymentStatusReportV09();

        //setting document header
        GroupHeader53 paymentStatusHeader = new GroupHeader53();
        paymentStatusHeader.setMsgId(customerCreditTransfer.getGrpHdr().getMsgId());
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        try {
            paymentStatusHeader.setCreDtTm(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        } catch (DatatypeConfigurationException e) {
            LOG.error("could not create xml gregorian datetime");
            throw e;
        }
        paymentStatusReport.setGrpHdr(paymentStatusHeader);

        // setting original group header
        OriginalGroupHeader13 originalGroupHeader = new OriginalGroupHeader13();
        originalGroupHeader.setOrgnlMsgId(customerCreditTransfer.getGrpHdr().getMsgId());
        originalGroupHeader.setOrgnlMsgNmId(customerCreditTransfer.getGrpHdr().getMsgId());
        originalGroupHeader.setOrgnlCreDtTm(customerCreditTransfer.getGrpHdr().getCreDtTm());
        originalGroupHeader.setOrgnlNbOfTxs(customerCreditTransfer.getGrpHdr().getNbOfTxs());
        if (customerCreditTransfer.getGrpHdr().getCtrlSum() != null) {
            originalGroupHeader.setOrgnlCtrlSum(customerCreditTransfer.getGrpHdr().getCtrlSum());
        }
        paymentStatusReport.getOrgnlGrpInfAndSts().add(originalGroupHeader);
        return responseDocument;
    }

    private Document topup(final Document sourceDocument, final String accountId,
            final Document responseDocument) {
        service.saveTopUpTransaction(sourceDocument, accountId)
                .forEach(transaction -> {
                    constructTransactionStatusResponse(responseDocument, transaction, ExternalPaymentTransactionStatusCode.ACCC);
                });
        return responseDocument;
    }

    private void constructTransactionStatusResponse(Document responseDocument, Transaction transaction,ExternalPaymentTransactionStatusCode statusCode) {
        PaymentTransaction91 paymentTransactionStatus = new PaymentTransaction91();
        paymentTransactionStatus.setOrgnlTxId(transaction.getTransactionKey().getTransactionId());
        paymentTransactionStatus.setOrgnlEndToEndId(transaction.getEndToEndId());
        paymentTransactionStatus.setTxSts(statusCode.name());
        responseDocument.getFIToFIPmtStsRpt().getTxInfAndSts().add(paymentTransactionStatus);
    }

    @PostMapping(value = TOPUP_FOR_ACCOUNT_SYNC, consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public Document topup(@RequestBody String xmldocument, @PathVariable("accountId") String accountId) throws JAXBException, DatatypeConfigurationException {
        Document document = transformXmlToObject(xmldocument);
        LOG.debug("document size : " + document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size());
        Document responseDocument = preparePaymentStatusReportDocumentWithoutStatus(document);
        return topup(document, accountId, responseDocument);
    }

    //TODO : later for account id we need to get it from authentication header
    @PostMapping(value = TOPUP_FOR_ACCOUNT_ASYNC, consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType
            .APPLICATION_XML_VALUE})
    public Flux<Document> topupAsync(@RequestBody String xmldocument,
            @PathVariable("accountId") String accountId) throws JAXBException, DatatypeConfigurationException {
        Document document = transformXmlToObject(xmldocument);
        LOG.debug("document size : " + document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size());
        Document responseDocument = preparePaymentStatusReportDocumentWithoutStatus(document);
        return topupAsync(document, accountId, responseDocument);
    }

    private Flux<Document> topupAsync(final Document document, final String accountId,
            final Document responseDocument) {
        Flux.from(service.saveTopUpTransactionAsync(document, accountId)).log().doOnEach(transactionSignal -> {
            if (transactionSignal.isOnComplete()) {
                constructTransactionStatusResponse(responseDocument, transactionSignal.get(), ExternalPaymentTransactionStatusCode.ACCC);
            }
            if (transactionSignal.isOnError()) {
                if (transactionSignal.get() == null) {
                    Transaction dummyTransaction = new Transaction(new TransactionKey(null, null, null), null, null, null, null, null, null, null,
                            null,  null);
                    constructTransactionStatusResponse(responseDocument, dummyTransaction, ExternalPaymentTransactionStatusCode.RJCT);
                } else {
                    constructTransactionStatusResponse(responseDocument, transactionSignal.get(), ExternalPaymentTransactionStatusCode.RJCT);
                }
            }
        }).subscribe();
        return Flux.just(responseDocument);
    }

    @PostMapping(value = "/account-statement/{accountId}", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public GenericSingleRestResponse transactionHistory(@PathVariable("accountId") String accountId,
            @Param("start") long startDate, @Param("end") long endDate,
            @Param("row") int row, @Param("page") int page) {
        //TODO edit here
        Document responseDocument = prepareDocumentBankToCustomerStatement(startDate, endDate, row, page);
        return history(accountId, responseDocument, new Date(startDate), new Date(endDate), CassandraPageRequest.of(page, row));
    }

    private Document prepareDocumentBankToCustomerStatement(long startDate, long endDate, int row, int page) {

    }

    private Document transformXmlToObject(String xmldocument) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<Document> jaxbElement = (JAXBElement) unmarshaller.unmarshal(new StringReader(xmldocument));
        return jaxbElement.getValue();
    }

}
