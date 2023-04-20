package com.careerit.jfs.cj.day4;

public class ContinueExample {

  public static void main(String[] args) {
    for (int i = 2; i <= 20; i = i + 2) {
      if (i % 3 == 0) {
        break;
      }
      System.out.println(i);
    }
  }
}
