package com.careerit.jfs.cj.day12;

public class AccountManager {

    public static void main(String[] args) {
      Account obj1 = new Account(1001,"Krish",50000);
      obj1.showDetails();
      System.out.println("--------------------------------------------------");
      obj1.withdraw(10000);
      obj1.showDetails();
      Account obj2 = new Account(1002 ,"Manoj", 60000);
      obj2.showDetails();
      System.out.println();
      obj2.deposit(40000);
      obj2.showDetails();
    }
}
