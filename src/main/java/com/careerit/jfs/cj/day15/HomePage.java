package com.careerit.jfs.cj.day15;

public class HomePage {

  static int count = 0;
  public HomePage(){
      count++;
  }
  public static int getCount(){
      return count;
  }
}
