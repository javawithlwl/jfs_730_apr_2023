package com.careerit.jfs.cj.day2;

import java.util.Scanner;

public class SumAndAvgOfThreeNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of height1 :");
    float height1 = sc.nextFloat();
    System.out.println("Enter the value of height2 :");
    float height2 = sc.nextFloat();
    System.out.println("Enter the value of height3 :");
    float height3 = sc.nextFloat();

    float sum = height1 + height2 + height3;
    float avg = sum / 3;
    System.out.println("The sum is :"+sum);
    System.out.println("The avg is :"+avg);

  }
}
