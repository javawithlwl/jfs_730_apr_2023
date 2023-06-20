package com.careerit.jfs.cj.day7;

public class AccountManager {

  public static void main(String[] args) {

        Account account1 = new Account(1000,"Manoj",5000000);
        account1.showDetails();
        Account account2 = new Account(1001,"Krish",8000);
        account2.showDetails();
        account2.deposit(2000);
        account2.showDetails();

  }
}
