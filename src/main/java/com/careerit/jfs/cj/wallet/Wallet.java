package com.careerit.jfs.cj.wallet;

public class Wallet {

  private String name;
  private String mobile;
  private double balance;

  public Wallet(String name, String mobile, double balance) {
    this.name = name;
    this.mobile = mobile;
    this.balance = balance;
  }

  public void showDetails() {
    System.out.println(name + "," + mobile + "," + balance);
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Amount " + amount + " is credited to your account and your current balance is " + balance);
  }

  public double getBalance() {
    return balance;
  }

  public String getName() {
    return name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
