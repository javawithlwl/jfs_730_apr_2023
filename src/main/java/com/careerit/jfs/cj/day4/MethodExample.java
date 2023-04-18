package com.careerit.jfs.cj.day4;

public class MethodExample {

  // 1. factorial of given number
  // 2. find the sum of series 1 + 1 /2! + 1/3! + ... + 1/n!

  public static void main(String[] args) {

    int n = 5;
    int fact = factorial(n);
    System.out.println("Factorial of " + n + " is " + fact);
    double sum = 1;
    for(int i=2;i<=n;i++){
      sum  = sum + 1/(double)factorial(i);
    }
    System.out.println(sum);
  }

  public  static int factorial(int n){
    int fact = 1;
    for (int i = 2; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

}
