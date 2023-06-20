package com.careerit.jfs.cj.day17;

public class SavingsAccount extends  Account{

    private double minBalance;

    public SavingsAccount(long id,String name,double balance,double minBalance){
        super(id,name,balance);
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Sorry! Insufficient funds");
        }else{
            if(minBalance > balance - amount){
                System.out.println("Sorry! You can't withdraw this amount, min balance should be maintained");
            }else{
                balance -= amount;
                System.out.println("Amount "+amount+" is debited from your account");
            }
        }
    }
}
