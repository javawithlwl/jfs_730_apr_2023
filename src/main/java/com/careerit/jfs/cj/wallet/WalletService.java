package com.careerit.jfs.cj.wallet;

import java.util.ArrayList;
import java.util.List;

public class WalletService {

  private List<Wallet> list;
  private List<Payment> paymentList;

  public WalletService() {
    list = new ArrayList<>();
    paymentList = new ArrayList<>();
  }

  public void createWallet(Wallet wallet) {
    if (isWalletExists(wallet.getMobile())) {
      System.out.println("Already wallet exists with the given mobile number :" + wallet.getMobile());
    } else {
      list.add(wallet);
      System.out.println("Wallet creates successfully");
    }
  }
  public void loadMoney(String mobile, double amount) {
    if (isWalletExists(mobile)) {
      Wallet wallet = getWallet(mobile);
      wallet.deposit(amount);
      Payment payment = new Payment(mobile,TransactionType.CR,amount);
      paymentList.add(payment);
    } else {
      System.out.println("There is no wallet exists with given mobile number :" + mobile);
    }
  }
  public void viewWallets(){
    if(list.isEmpty()){
      System.out.println("No wallet is created yet, please create wallet to see the details");
    }else {
      for (Wallet wallet : list) {
        System.out.println("");
        wallet.showDetails();
      }
    }
  }
  public void showWalletStats(){
        if(list.isEmpty()){
          System.out.println("No wallets are created yet....");
        }else{
            double totalBalance = 0;
            for(Wallet wallet:list){
                totalBalance += wallet.getBalance();
            }
          System.out.println("Total Wallet Count     :"+list.size());
          System.out.println("Total Wallet Balance   :"+totalBalance);
          System.out.println("Average Wallet Balance :"+totalBalance/(double)list.size());
        }
  }
  public void transferAmount(String fromMobile, String toMobile, double amount) {
    if (isWalletExists(fromMobile) && isWalletExists(toMobile)) {
      Wallet fromWallet = getWallet(fromMobile);
      if (fromWallet.getBalance() >= amount) {
        Wallet toWallet = getWallet(toMobile);
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);

        Payment payment1 = new Payment(toMobile,TransactionType.CR,amount);
        paymentList.add(payment1);

        Payment payment2 = new Payment(fromMobile,TransactionType.DR,amount);
        paymentList.add(payment2);

        System.out.println("Wallet with mobile "+fromMobile+ " the amount " + amount + " is credited and your current balance is " + toWallet.getBalance());
        System.out.println("Wallet with mobile "+fromMobile+ " the amount " + amount + " is debited and your current balance is " + fromWallet.getBalance());
      }else{
        System.out.println("You don't have sufficient funds");
      }
    }else{
      System.out.println("Please provide valid from and to mobile numbers");
    }
  }
  public void showPaymentDetails(){
      for(Payment payment:paymentList){
          payment.showDetails();
          System.out.println("");
      }
  }
  private Wallet getWallet(String mobile) {
    for (Wallet wallet : list) {
      if (wallet.getMobile().equals(mobile)) {
        return wallet;
      }
    }
    return null;
  }
  private boolean isWalletExists(String mobile) {
    for (Wallet wallet : list) {
      if (wallet.getMobile().equals(mobile)) {
        return true;
      }
    }
    return false;
  }
}
