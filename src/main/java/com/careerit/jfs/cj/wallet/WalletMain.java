package com.careerit.jfs.cj.wallet;

import java.util.Scanner;

public class WalletMain {


  public static void main(String[] args) {

      WalletService walletService = new WalletService();
      Scanner sc = new Scanner(System.in);
      for(;;){
        System.out.println("-".repeat(100));
        System.out.println(" ".repeat(40)+" Welcome to Wallet Service  "+" ".repeat(40));
        System.out.println("1. Create 2. Deposit 3. Transfer 4. View All 5. Payment 6. Exit");
        System.out.println("-".repeat(100));
        System.out.println("Enter your choice :");
        int ch = sc.nextInt();
        switch (ch){
          case 1: Wallet wallet = getWalletInfo();
                  walletService.createWallet(wallet);
                  break;
          case 2:
            sc.nextLine();
            System.out.println("Enter the mobile :");
            String mobile = sc.nextLine();
             System.out.println("Enter the amount :");
            double amount = sc.nextDouble();
            System.out.println("Mobile number "+mobile);
            walletService.loadMoney(mobile,amount);
            break;
          case 3:
            sc.nextLine();
            System.out.println("Enter the from mobile :");
            String fromMobile = sc.nextLine();
            System.out.println("Enter the to mobile :");
            String toMobile = sc.nextLine();
            System.out.println("Enter the amount :");
            double transferAmount = sc.nextDouble();
            walletService.transferAmount(fromMobile,toMobile,transferAmount);
            break;
          case 4:
            walletService.viewWallets();
            break;
          case 5:
            walletService.showPaymentDetails();
            break;
          case 6:
            System.out.println("Thanks for using wallet service application");
            System.exit(0);
        }

      }
  }

  private static Wallet getWalletInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mobile ");
    String mobile = sc.nextLine();
    System.out.println("Enter the name ");
    String name = sc.nextLine();
    System.out.println("Enter the balance ");
    double balance = sc.nextDouble();
    Wallet wallet = new Wallet(name,mobile,balance);
    return wallet;
  }
}
