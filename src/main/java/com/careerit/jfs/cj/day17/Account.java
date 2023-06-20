package com.careerit.jfs.cj.day17;

public class Account {

    long id;
    String name;
    double balance;

    public Account(long id,String name,double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Sorry! Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount "+amount+" is debited from your account");
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" is credited to your account");
    }
    public void showDetails(){
        System.out.println("Id :"+id+" Name :"+name+" Balance :"+balance);
    }
}
