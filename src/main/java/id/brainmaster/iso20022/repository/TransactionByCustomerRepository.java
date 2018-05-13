package id.brainmaster.iso20022.repository;

import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.entity.TransactionKey;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TransactionByCustomerRepository extends CrudRepository<Transaction, TransactionKey> {
    Slice<Transaction> findAllByTransactionKeyAccountIdAndTransactionKeyCreationDateIsBetween(String accountId, Date startDate, Date endDate, Pageable pageable);
}
