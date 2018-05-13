package id.brainmaster.iso20022.controller;

import id.brainmaster.iso20022.model.Document;
import id.brainmaster.iso20022.model.GroupHeader70;
import id.brainmaster.iso20022.model.response.CreditTransferTransaction30Status;
import id.brainmaster.iso20022.model.response.GenericSingleRestResponse;
import id.brainmaster.iso20022.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.query.CassandraPageRequest;
import org.springframework.data.domain.PageRequest;
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
import java.io.StringReader;
import java.util.Date;

@RestController("/transaction")
public class TransactionController {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private TransactionService service;

    @Autowired
    private JAXBContext context;

    //TODO : later get it from authentication header
    @PostMapping(value = "/topup/{accountId}/async", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public Flux<GenericSingleRestResponse> topupAsync(@RequestBody String xmldocument, @PathVariable("accountId") String accountId) throws JAXBException {
        Document document = transformXmlToObject(xmldocument);
        LOG.info("document size : " + document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size());
        GenericSingleRestResponse genericSingleRestResponse = prepareResponseDocument(document);
        return topupAsync(document, accountId, genericSingleRestResponse);
    }

    @PostMapping(value = "/topup/{accountId}", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public GenericSingleRestResponse topup(@RequestBody String xmldocument, @PathVariable("accountId") String accountId) throws JAXBException {
        Document document = transformXmlToObject(xmldocument);
        LOG.info("document size : " + document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size());
        GenericSingleRestResponse genericSingleRestResponse = prepareResponseDocument(document);
        return topup(document, accountId, genericSingleRestResponse);
    }


    @PostMapping(value = "/account-statement/{accountId}", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public GenericSingleRestResponse transactionHistory(@RequestBody String xmldocument, @PathVariable("accountId") String accountId,
                                                        @Param("start") long startDate, @Param("end") long endDate,
                                                        @Param("row") int row, @Param("page") int page) throws JAXBException {
        Document document = transformXmlToObject(xmldocument);
        LOG.info("document size : " + document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size());
        GenericSingleRestResponse genericSingleRestResponse = prepareResponseDocument(document);
        return history(document, accountId, genericSingleRestResponse, new Date(startDate), new Date(endDate), CassandraPageRequest.of(page, row));
    }

    private GenericSingleRestResponse history(final Document document, final String accountId, final GenericSingleRestResponse genericSingleRestResponse,
                                              final Date startDate, final Date endDate, final Pageable pageable) {
        //TODO: change the implementation
//        service.getTransactionHistoryByCustomer(accountId, startDate, endDate, pageable).stream().forEach(transaction -> );
        return null;
    }

    private GenericSingleRestResponse topup(final Document document, final String accountId, final GenericSingleRestResponse genericSingleRestResponse) {
        service.saveTopUpTransaction(document, accountId)
                .forEach(transaction -> genericSingleRestResponse.getCdtTrfTxInfSts().add(
                        new CreditTransferTransaction30Status(null, transaction.getEndToEndId(), transaction.getTransactionKey().getTransactionId(), null, true)));
        return genericSingleRestResponse;
    }

    private GenericSingleRestResponse prepareResponseDocument(final Document document) {
        GenericSingleRestResponse genericSingleRestResponse = new GenericSingleRestResponse();
        final GroupHeader70 groupHeader = new GroupHeader70();
        BeanUtils.copyProperties(document.getFIToFICstmrCdtTrf().getGrpHdr(), groupHeader);
        genericSingleRestResponse.setGrpHdr(groupHeader);
        return genericSingleRestResponse;
    }

    private Document transformXmlToObject(String xmldocument) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<Document> jaxbElement = (JAXBElement) unmarshaller.unmarshal(new StringReader(xmldocument));
        return jaxbElement.getValue();
    }

    private Flux<GenericSingleRestResponse> topupAsync(final Document document, final String accountId, final GenericSingleRestResponse genericSingleRestResponse) {
        Flux.from(service.saveTopUpTransactionAsync(document, accountId)).log().map(transaction -> {
            if (transaction != null) {
                return new CreditTransferTransaction30Status(null, transaction.getEndToEndId(), transaction.getTransactionKey().getTransactionId(), null, true);
            }
            return null;
        }).doOnEach(creditTransferTransaction30StatusSignal -> {
            genericSingleRestResponse.getCdtTrfTxInfSts().add(creditTransferTransaction30StatusSignal.get());
        }).subscribe();
        return Flux.just(genericSingleRestResponse);
    }

}
