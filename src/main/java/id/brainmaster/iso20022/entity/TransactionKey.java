package id.brainmaster.iso20022.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Date;

@PrimaryKeyClass
public class TransactionKey implements Serializable {

    //TODO: harusnya accountId di ganti sama unique id dari Account, unique id account bisa hashing dari primary key account tsb
    @PrimaryKeyColumn(name = "account_id", type = PrimaryKeyType.PARTITIONED, ordinal = 0)
    private final String accountId;
    @PrimaryKeyColumn(name = "transaction_id", type = PrimaryKeyType.CLUSTERED, ordinal = 1)
    private final String transactionId;
    @PrimaryKeyColumn(name = "creation_date", type = PrimaryKeyType.CLUSTERED, ordinal = 2, ordering = Ordering.ASCENDING)
    private Date creationDate;

    public TransactionKey(String transactionId, String accountId, Date creationDate) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.creationDate = creationDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(transactionId)
                .append(accountId)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TransactionKey that = (TransactionKey) o;

        return new EqualsBuilder()
                .append(transactionId, that.transactionId)
                .append(accountId, that.accountId)
                .isEquals();
    }
}
