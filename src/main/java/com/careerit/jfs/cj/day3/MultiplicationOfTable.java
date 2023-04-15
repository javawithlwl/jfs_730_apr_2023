package com.careerit.jfs.cj.day3;

public class MultiplicationOfTable {

  public static void main(String[] args) {

    int num = 19;
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + num * i);
    }
    System.out.println("-".repeat(50));
    for (int i = 10; i >= 1; i--) {
      System.out.println(num + " * " + i + " = " + num * i);
    }
  }
}
