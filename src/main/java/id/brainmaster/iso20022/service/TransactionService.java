package id.brainmaster.iso20022.service;

import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.model.Document;
import id.brainmaster.iso20022.util.Iso20022TransactionHelper;
import id.brainmaster.iso20022.util.TransactionType;
import id.brainmaster.iso20022.repository.AsyncTransactionByCustomerRepository;
import id.brainmaster.iso20022.repository.TransactionByCustomerRepository;
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

    public Flux<Transaction> saveTopUpTransactionAsync(Document document, String accountId) {
        Set<Transaction> transactions = Iso20022TransactionHelper.populateTransaction(document.getFIToFICstmrCdtTrf(), accountId, TransactionType.TOPUP.name());
        return asyncTransactionByCustomerRepository.saveAll(transactions).log().onErrorReturn(null);
    }

    public Iterable<Transaction> saveTopUpTransaction(Document document, String accountId) {
        Set<Transaction> transactions = Iso20022TransactionHelper.populateTransaction(document.getFIToFICstmrCdtTrf(), accountId, TransactionType.TOPUP.name());
        return transactionByCustomerRepository.saveAll(transactions);
    }

    public Slice<Transaction> getTransactionHistoryByCustomer(String accountId, Date startDate, Date endDate, Pageable pageable) {
        return transactionByCustomerRepository.findAllByTransactionKeyAccountIdAndTransactionKeyCreationDateIsBetween(accountId,startDate,endDate,pageable);
    }
}
