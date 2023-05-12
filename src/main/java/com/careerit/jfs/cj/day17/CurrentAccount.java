package com.careerit.jfs.cj.day17;

public class CurrentAccount extends  Account{

  private double overDraftLimit;

  public CurrentAccount(long id,String name,double balance,double overDraftLimit){
      super(id,name,balance);
      this.overDraftLimit = overDraftLimit;
  }

  @Override
  public void withdraw(double amount){
      if(amount > balance){
          if(amount > balance + overDraftLimit){
              System.out.println("Sorry! Insufficient funds");
          }else{
              balance -= amount;
              System.out.println("Amount "+amount+" is debited from your account");
          }
      }else{
          balance -= amount;
          System.out.println("Amount "+amount+" is debited from your account");
      }
  }
}
