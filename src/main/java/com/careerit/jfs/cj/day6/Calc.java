package com.careerit.jfs.cj.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter num2 :");
    int num2 = sc.nextInt();
    System.out.println("Entered value num1 = "+num1+" and num2 = "+num2);

    for (; ; ) {
      Arrays.binarySearch(new int[]{2,3,4,6,5},4);
      System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
      int ch = sc.nextInt();
      String res = "";
      switch (ch) {
        case 1:
          res = num1 + " + " + num2 + " = " + (num1 + num2);
          break;
        case 2:
          res = num1 + " - " + num2 + " = " + (num1 - num2);
          break;
        case 3:
          res = num1 + " * " + num2 + " = " + (num1 * num2);
          break;
        case 4:
          res = num1 + " / " + num2 + " = " + (num1 / num2);
          break;
        case 5:
          System.exit(0);
        default:
          System.out.println("Enter valid option 1-5 only");
      }
      System.out.println(res);
    }

  }
}
