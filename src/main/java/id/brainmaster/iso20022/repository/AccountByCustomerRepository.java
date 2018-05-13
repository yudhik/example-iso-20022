package id.brainmaster.iso20022.repository;

import id.brainmaster.iso20022.entity.Account;
import id.brainmaster.iso20022.entity.AccountKey;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface AccountByCustomerRepository extends ReactiveCassandraRepository<Account, AccountKey> {
}
