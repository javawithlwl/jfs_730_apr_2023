package com.careerit.jfs.cj.day7;

public class Account {

  int accNum;
  String name;
  double balance;

  public Account(int accNum,String name, double balance){
      this.accNum = accNum;
      this.name = name;
      this.balance = balance;
  }

  public void withdraw(double amount) {
        if(amount <= balance){
            balance = balance - amount;
        }else{
          System.out.println("You don't sufficient balance");
        }
  }

  public void deposit(double amount) {
          balance = balance + amount;
  }

  public void showDetails() {
    System.out.println(accNum + " " + name + " " + balance);
  }
}
