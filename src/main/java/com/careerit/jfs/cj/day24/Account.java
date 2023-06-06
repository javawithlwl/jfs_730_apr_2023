package com.careerit.jfs.cj.day24;

public class Account {

      private long id;
      private String name;
      private double balance;

      public Account(long id,String name,double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
      }
      public void showInfo(){
        System.out.println("Id :"+id+" Name :"+name+" Balance :"+balance);
      }
      public void withdraw(double amount){
        if(amount <= 0){
          throw new IllegalArgumentException("Amount should be greater than zero");
        }
        if(amount > balance){
          throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
      }
      public void deposit(double amount){
        if(amount <= 0){
          throw new IllegalArgumentException("Amount should be greater than zero");
        }
        balance += amount;
      }
}
