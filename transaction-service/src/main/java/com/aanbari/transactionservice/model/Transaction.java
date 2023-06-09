package com.aanbari.transactionservice.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "transaction_table")
public class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "from")
    private int from;
    @Column(name = "to")

    private int to;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name="date")
    private long timestamp;

    public Transaction() {
    }

    public Transaction(int from, int to, BigDecimal amount, long timestamp) {

        this.from = from;
        this.to = to;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
