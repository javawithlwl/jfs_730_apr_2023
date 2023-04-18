package com.careerit.jfs.cj.day3;

public class FibonacciSeriesExample {

  public static void main(String[] args) {

    int n = 10;

    int a = 0;
    int b = 1;
    System.out.print(a + " " + b+" ");
    for (int i = 3; i <=n; i++) {
        int sum = a + b;
        System.out.print(sum+" ");
        a = b;
        b = sum;
    }

  }
}
