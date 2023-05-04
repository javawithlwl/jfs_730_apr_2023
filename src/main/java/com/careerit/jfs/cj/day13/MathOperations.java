package com.careerit.jfs.cj.day13;

import java.util.List;

public class MathOperations {


  // 1. Write a method to find the sum of two numbers
  // 2. Write a method to find the sum of three numbers
  // 3. Write a method to find the sum of n number

  public int sum(int a, int b) {
    System.out.println("Sum of two integer");
    return a + b;
  }

  public int sum(char a, char b) {
    System.out.println("Sum of two characters");
    return a + b;
  }

  public int sum(int a, int b, int c) {
    return a + b + c;
  }

  public int sum(int... arr) {
    int sum = 0;
    for (int ele : arr) {
      sum += ele;
    }
    return sum;
  }

  public static void main(String... args) {
    MathOperations obj = new MathOperations();
    System.out.println(obj.sum(1, 2));
    System.out.println(obj.sum('a', 'b'));
    System.out.println(obj.sum(1, 'b'));
    System.out.println(obj.sum(1));
    System.out.println(obj.sum(1, 2, 3));
  }

}
