package com.careerit.jfs.cj.day3;

public class FactorsOfGivenNumber {

  public static void main(String[] args) {

    int n = 28;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
        count++;
      }
    }
    System.out.println();
    if (count == 2) {
      System.out.println(n + " is a prime");
    } else {
      System.out.println(n + " is not a prime");
    }

  }
}
