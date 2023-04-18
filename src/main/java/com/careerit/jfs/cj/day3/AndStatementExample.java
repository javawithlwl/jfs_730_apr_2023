package com.careerit.jfs.cj.day3;

public class AndStatementExample {

  public static void main(String[] args) {

    int a = 1, b = 1, c = 1;
    if (a > 5 || (b = 2) > 6 || (c = 10) > 15) {
      System.out.println("Hello");
    }
    System.out.println(a + "," + b + "," + c);
  }
}
