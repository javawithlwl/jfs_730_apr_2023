package com.careerit.jfs.cj.day12;

public class Account {

  private long accNumber;
  private String name;
  private double balance;

  public Account(int accNumber, String name, double balance) {
    this.accNumber = accNumber;
    this.name = name;
    this.balance = balance;
  }
  public void withdraw(double amount){
      if(amount > balance){
          System.out.println("Sorry! Insufficient funds");
      }else{
          balance -= amount;
          System.out.println("Amount "+amount+" is debited from your account and your current balance is "+balance);
      }
  }
  public void deposit(double amount){
      balance += amount;
      System.out.println("Amount "+amount+" is credited to your account and your current balance is "+balance);
  }
  public void showDetails() {
    System.out.println(accNumber + "," + name + "," + balance);
  }

  public double getBalance() {
    return balance;
  }

  public String getName() {
    return name;
  }

  public long getAccNumber() {
    return accNumber;
  }
}
