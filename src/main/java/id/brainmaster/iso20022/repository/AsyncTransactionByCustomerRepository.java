package id.brainmaster.iso20022.repository;

import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.entity.TransactionKey;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface AsyncTransactionByCustomerRepository extends ReactiveCassandraRepository<Transaction, TransactionKey> {
}
