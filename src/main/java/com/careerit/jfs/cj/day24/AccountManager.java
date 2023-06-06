package com.careerit.jfs.cj.day24;

public class AccountManager {
  public static void main(String[] args) {
        Account account = new Account(1001,"Krish", 10000);
        try{
            account.withdraw(15000);}
        catch(InsufficientFundsException e){
            e.printStackTrace();
        }
  }
}
