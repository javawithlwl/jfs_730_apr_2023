package com.careerit.jfs.cj.day11;

import java.time.LocalDate;

public class EmployeeInformation {

  public static void main(String[] args) {

    String name = "Krish";
    String project = "DHI";
    LocalDate dob = LocalDate.of(1987, 6, 6);
    double salary = 190000;

    StringBuilder sb = new StringBuilder();
    sb.append(name).append("-").append(project).append("-").append(dob).append("-").append(salary);
    String data = sb.toString();
    System.out.println(data);
    StringBuilder sb1 = new StringBuilder();
    String str = "123456";
    StringBuilder sb2 = new StringBuilder(str);
    sb2.reverse();
    System.out.println(sb2);

  }

  public static boolean isPalindrome(String str) {
    return new StringBuilder(str).reverse().toString().equals(str);
  }
}
