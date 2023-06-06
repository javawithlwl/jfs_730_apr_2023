package com.careerit.jfs.cj.day24;

public class TryWithFinallyExample {

  public static void main(String[] args) {

    System.out.println("Start of main");
    try {
      int[] arr = new int[]{1, 2, 3, 4, 5};
      System.out.println(arr[5]);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Finally block");
    }
    System.out.println("End of main");
  }
}
