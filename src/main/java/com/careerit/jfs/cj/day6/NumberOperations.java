package com.careerit.jfs.cj.day6;

import java.util.Scanner;

public class NumberOperations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("1.Is Prime 2.Sum of digits 3.Reverse 4.Fibonacci term 5.Exit");
      int ch = sc.nextInt();
      switch (ch){
        case 1:
          System.out.println("Enter the number to check prime ");
          int num = sc.nextInt();
          boolean flag = isPrime(num);
          System.out.println(num+" is prime ? :"+flag);
          break;
        case 2:
          System.out.println("Enter the number to find sum of digits ");
          int snum = sc.nextInt();
          int res = sumOfDigits(snum);
          System.out.println("The sum of digits of "+snum+" is "+res);
          break;
        case 3:
          System.out.println("Enter the number to find reverse ");
          int rnum = sc.nextInt();
          int rres = reverse(rnum);
          System.out.println("The reverse of "+rnum+" is "+rres);
          break;
        case 4:
          System.out.println("Enter the number to find fibonacci tern ");
          int fnum = sc.nextInt();
          int fres = fibonacciTerm(fnum);
          System.out.println("The "+fnum+" term value is "+fres);
          break;
        case 5:
          System.out.println("Thank you");
          System.exit(0);
        default:
          System.out.println("Enter valid input 1-5 only");
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num != 0) {
      int r = num % 10;
      sum += r;
      num /= 10;
    }
    return sum;
  }

  public static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num /= 10;
    }
    return rev;
  }

  public static int fibonacciTerm(int num) {
    if (num == 1) {
      return 0;
    } else if (num == 2 || num == 3) {
      return 1;
    } else {
      int a = 0, b = 1;
      for (int i = 2; i <= num; i++) {
        int sum = a + b;
        a = b;
        b = sum;
      }
      return b;
    }
  }
}
