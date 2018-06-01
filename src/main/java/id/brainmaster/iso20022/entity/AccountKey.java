package id.brainmaster.iso20022.entity;

import com.datastax.driver.core.DataType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Date;

@PrimaryKeyClass
public class AccountKey implements Serializable {

    @PrimaryKeyColumn(name = "account_id", type = PrimaryKeyType.PARTITIONED, ordinal = 0)
    private final String accountId;

    @PrimaryKeyColumn(name = "wallet_type", type = PrimaryKeyType.PARTITIONED, ordinal = 1)
    @CassandraType(type = DataType.Name.TEXT)
    private final WalletType walletType;

    @PrimaryKeyColumn(name = "currency", type = PrimaryKeyType.PARTITIONED, ordinal = 2)
    @CassandraType(type = DataType.Name.TEXT)
    private final Currency currency;

    @PrimaryKeyColumn (value = "creation_date", type = PrimaryKeyType.CLUSTERED, ordinal = 4, ordering = Ordering.ASCENDING)
    private final Date creationDate;

    public AccountKey(String accountId, WalletType walletType, Currency currency, Date creationDate) {
        this.accountId = accountId;
        this.walletType = walletType;
        this.currency = currency;
        this.creationDate = creationDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public WalletType getWalletType() {
        return walletType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AccountKey that = (AccountKey) o;

        return new EqualsBuilder()
                .append(accountId, that.accountId)
                .append(walletType, that.walletType)
                .append(currency, that.currency)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(accountId)
                .append(walletType)
                .append(currency)
                .toHashCode();
    }
}
