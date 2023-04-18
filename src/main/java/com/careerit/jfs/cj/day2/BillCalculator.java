package com.careerit.jfs.cj.day2;

import java.util.Scanner;

public class BillCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the bill amount :");
    double billAmount = sc.nextDouble();
    double discount = 0;
    if(billAmount >= 10000){
        discount = billAmount * 0.1;
    }
    double netAmount = billAmount - discount;
    System.out.println("Bill amount :"+billAmount);
    System.out.println("Discount    :"+discount);
    System.out.println("Net amount  :"+netAmount);
  }
}
