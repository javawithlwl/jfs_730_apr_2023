package com.careerit.jfs.cj.day17;

public class Transaction {

  private int id;
  private String from;
  private String to;
  private double amount;
  private String status;

  public Transaction(int id, String from, String to, double amount, String status) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.amount = amount;
    this.status = status;
  }

  public void showDetails() {
    System.out.println("Id :" + id + " From :" + from + " To :" + to + " Amount :" + amount + " Status :" + status);
  }

  public void setId(int id) {
     this.id = id;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
