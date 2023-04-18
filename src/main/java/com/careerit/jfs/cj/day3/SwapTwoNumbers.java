package com.careerit.jfs.cj.day3;

public class SwapTwoNumbers {

  public static void main(String[] args) {

      int a = 10;
      int b = 20;
      System.out.println("Before swap a = "+a +" and b = "+b);

      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("After swap a = "+a +" and b = "+b);
  }
}
