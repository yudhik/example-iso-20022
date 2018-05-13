package id.brainmaster.iso20022.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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

    @Column("transaction_type")
    private String transactionType;

    @Column("source_name")
    private String sourceName;

    @Column("source_id")
    private String sourceId;

    @Column("destination_name")
    private String destinationName;

    @Column("destination_id")
    private String destinationId;

    @Column("end_to_end_id")
    private String endToEndId;

    public Transaction(TransactionKey transactionKey, BigDecimal amount, String transactionType, String sourceName, String sourceId, String destinationName, String destinationId, String endToEndId) {
        this.transactionKey = transactionKey;
        this.amount = amount;
        this.transactionType = transactionType;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.destinationName = destinationName;
        this.destinationId = destinationId;
        this.endToEndId = endToEndId;
    }

    public TransactionKey getTransactionKey() {
        return transactionKey;
    }

    public void setTransactionKey(TransactionKey transactionKey) {
        this.transactionKey = transactionKey;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(transactionKey)
                .toHashCode();
    }
}
