package com.aanbari.userservice.entity;

import java.math.BigDecimal;

public class Transaction {

    private int id;
    private int from;
    private int to;
    private BigDecimal amount;
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
