package com.careerit.jfs.cj.day24;

import java.util.Scanner;

public class ExceptionExample2 {

  public static void main(String[] args) {

    System.out.println("Start of main");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1:");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2:");
    int num2 = sc.nextInt();
    try {
      int res = num1 / num2;
      System.out.println("Result :" + res);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (ArithmeticException e) {
      System.out.println("Num2 should not be zero");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
    System.out.println("End of main");
  }
}
