package com.careerit.jfs.cj.day5;

public class FactorialOfNumber {

  public static void main(String[] args) {
    int num = 6;
    int res = factorial(num);
    System.out.println("Factorial of " + num + " is  " + res);
    int n = 10;
    int sum = sumOfFirstNOddNumbersUsingFor(n);
    System.out.println("The sum of first " + n + " odd natural number is " + sum);
  }

  // To see recent opened files ctrl+e
  // Format code ctrl+alt+L
  public static int factorial(int num) {
    int fact = 1;
    int i = 2;
    while (i <= num) {
      fact *= i;
      i++;
    }
    return fact;
  }

  public static int sumOfFirstNOddNumbers(int n) {
    int sum = 0;
    int i = 1;
    while (i <= n) {
      if (i % 2 != 0) {
        sum += i;
      }
      i++;
    }
    return sum;
  }

  public static int sumOfFirstNOddNumbersUsingFor(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i = i + 2) {
      sum += i;
    }
    return sum;
  }
}
