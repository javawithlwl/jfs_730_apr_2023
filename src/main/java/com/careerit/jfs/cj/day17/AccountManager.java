package com.careerit.jfs.cj.day17;

public class AccountManager {

  public static void main(String[] args) {

        Account account = new Account(1001,"Krish",45000);
        account.withdraw(10000);
        account.showDetails();
  }
}
