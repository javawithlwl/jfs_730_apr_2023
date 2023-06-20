package com.careerit.jfs.cj.wallet;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Payment {

    private long id;
    private String mobile;
    private TransactionType transactionType;
    private double amount;
    private LocalDateTime txnDate;
    public Payment(String mobile,TransactionType transactionType,double amount){
            this.id = ThreadLocalRandom.current().nextLong(100001,9999999);
            this.amount = amount;
            this.mobile = mobile;
            this.transactionType = transactionType;
            this.txnDate = LocalDateTime.now();
    }
    public void showDetails(){
        System.out.println(id+","+mobile+","+amount+","+txnDate);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(LocalDateTime txnDate) {
        this.txnDate = txnDate;
    }
}
