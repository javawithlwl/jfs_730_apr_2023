package com.careerit.jfs.cj.day15;

public class Account {

      private int accNumber;
      private String name;
      private double balance;
      private static String bankName = "SBI";

      public Account(int accNumber,String name,double balance){
          this.accNumber = accNumber;
          this.name = name;
          this.balance = balance;
      }
      public void showInfo(){
          System.out.println("Account number :"+accNumber);
          System.out.println("Name           :"+name);
          System.out.println("Balance        :"+balance);
          System.out.println("Bank Name      :"+bankName);
      }
}
