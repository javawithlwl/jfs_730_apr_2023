package com.careerit.jfs.cj.day11;

public class StringBufferExample {

  public static void main(String[] args) {

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.toString().equals(sb2.toString()));
  }
}
