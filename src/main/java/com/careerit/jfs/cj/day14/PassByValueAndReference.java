package com.careerit.jfs.cj.day14;

import java.util.Arrays;

public class PassByValueAndReference {

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
  public static void increment(int[] numArr){
      System.out.println(numArr);
      for(int i=0;i<numArr.length;i++){
        numArr[i] += 1;
      }
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Before swap a = " + a + " b = " + b);
    swap(a, b);
    System.out.println("After swap a = " + a + " b = " + b);
    int[] arr = new int[]{1,2,3,4,5};
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    increment(arr);
    System.out.println(Arrays.toString(arr));
  }
}
