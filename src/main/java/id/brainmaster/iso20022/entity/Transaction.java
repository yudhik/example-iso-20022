package id.brainmaster.iso20022.entity;

import com.datastax.driver.core.DataType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Table("transaction_by_customer")
public class Transaction implements Serializable {
    @PrimaryKey
    private TransactionKey transactionKey;

    @Column("amount")
    private BigDecimal amount;

    @Column("credit_debit")
    @CassandraType(type = DataType.Name.TEXT)
    private CreditDebitIndicator creditDebitIndicator;

    @Column("transactionCode")
    @CassandraType(type = DataType.Name.TEXT)
    private TransactionCode transactionCode;

    @Column("source_name")
    private String sourceName;

    @Column("source_id")
    private String sourceId;

    @Column("destination_name")
    private String destinationName;

    @Column("destination_id")
    private String destinationId;

    @Column("reference")
    private String reference;

    @Column("end_to_end_id")
    private String endToEndId;

    public Transaction(TransactionKey transactionKey, BigDecimal amount, CreditDebitIndicator creditDebitIndicator, TransactionCode transactionCode,
                       String sourceName, String sourceId, String destinationName, String destinationId, String reference, String endToEndId) {
        this.transactionKey = transactionKey;
        this.amount = amount;
        this.creditDebitIndicator = creditDebitIndicator;
        this.transactionCode = transactionCode;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.destinationName = destinationName;
        this.destinationId = destinationId;
        this.reference = reference;
        this.endToEndId = endToEndId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public CreditDebitIndicator getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public String getReference() {
        return reference;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public TransactionCode getTransactionCode() {
        return transactionCode;
    }

    public TransactionKey getTransactionKey() {
        return transactionKey;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(transactionKey)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        return new EqualsBuilder()
                .append(transactionKey, that.transactionKey)
                .isEquals();
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setTransactionCode(TransactionCode transactionCode) {
        this.transactionCode = transactionCode;
    }

    public void setTransactionKey(TransactionKey transactionKey) {
        this.transactionKey = transactionKey;
    }
}
