package com.careerit.jfs.cj.day4;

import java.time.LocalDateTime;
import java.util.Locale;

public class PatternExample {

  public static void main(String[] args) {
    int n = 5;
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println(Math.sqrt(16));
  }
  public static int sumOfNaturalNumber(int n){
          int sum = (n*(n+1))/2;
          return sum;
  }
  public static LocalDateTime getSystemTime(){
      return LocalDateTime.now();
  }
  public static void showGreetings(String message){
    System.out.println(message);
  }
  public static void showDate(){
    System.out.println(LocalDateTime.now());
  }
}
