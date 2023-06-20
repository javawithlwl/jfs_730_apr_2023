package com.careerit.jfs.cj.day11;

public class StringFormatExample {

  public static void main(String[] args) {

    String name = "Krish";
    float height = 5.6f;
    double salary = 180000;
    System.out.println(name + "," + height + "," + salary);
    System.out.println(String.format("%s,%s,%s",name,height,salary));
  }
}
