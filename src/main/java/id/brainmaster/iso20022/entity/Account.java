package id.brainmaster.iso20022.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table("account_by_customer")
public class Account implements Serializable {

    @PrimaryKey
    private AccountKey accountKey;

    @Column("customer_name")
    private String customerName;

    @Column("locked")
    private boolean locked;

    public Account() {
    }

    public Account(AccountKey accountKey, String customerName, boolean locked) {
        this.accountKey = accountKey;
        this.customerName = customerName;
        this.locked = locked;
    }

    public AccountKey getAccountKey() {
        return accountKey;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setAccountKey(AccountKey accountKey) {
        this.accountKey = accountKey;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }


}
