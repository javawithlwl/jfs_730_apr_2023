package com.careerit.jfs.cj.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
  public static void main(String[] args) {

    System.out.println("Enter the value of N:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = (n * (n + 1)) / 2;
    System.out.println("The sum of first " + n + " natural number is " + sum);

  }
}
