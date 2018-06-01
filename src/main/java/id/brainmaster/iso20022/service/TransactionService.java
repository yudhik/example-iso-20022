package id.brainmaster.iso20022.service;

import id.brainmaster.iso20022.entity.CreditDebitIndicator;
import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.entity.TransactionCode;
import id.brainmaster.iso20022.model.Document;
import id.brainmaster.iso20022.repository.AsyncTransactionByCustomerRepository;
import id.brainmaster.iso20022.repository.TransactionByCustomerRepository;
import id.brainmaster.iso20022.util.Iso20022TransactionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.Date;
import java.util.Set;

@Component
public class TransactionService {

    @Autowired
    private AsyncTransactionByCustomerRepository asyncTransactionByCustomerRepository;

    @Autowired
    private TransactionByCustomerRepository transactionByCustomerRepository;

    public Slice<Transaction> getTransactionHistoryByCustomer(String accountId, Date startDate, Date endDate, Pageable pageable) {
        return transactionByCustomerRepository.findAllByTransactionKeyAccountIdAndTransactionKeyCreationDateIsBetween(accountId, startDate, endDate,
                pageable);
    }

    public Iterable<Transaction> saveTopUpTransaction(Document document, String accountId) {
        return transactionByCustomerRepository.saveAll(extractTransactionFromDocumentWith(document, accountId, CreditDebitIndicator.CREDIT,
                TransactionCode.TOPUP, null));
    }

    public Flux<Transaction> saveTopUpTransactionAsync(Document document, String accountId) {
        return asyncTransactionByCustomerRepository.saveAll(extractTransactionFromDocumentWith(document, accountId, CreditDebitIndicator.CREDIT,
                TransactionCode.TOPUP, null)).log().onErrorReturn(null);
    }

    private Set<Transaction> extractTransactionFromDocumentWith(final Document document, final String accountId,
            final CreditDebitIndicator creditDebitIndicator, final TransactionCode transactionCode, final String reference) {
        return Iso20022TransactionHelper.populateTransaction(document.getFIToFICstmrCdtTrf(), accountId,
                creditDebitIndicator, transactionCode, reference);
    }
}
