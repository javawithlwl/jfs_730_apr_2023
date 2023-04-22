package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class ArrayExample1 {

  public static void main(String[] args) {

    String data = "10,20,30,50,60,90,100,40,70";
    String[] arr = data.split(",");
    int[] numArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int ele = Integer.parseInt(arr[i]);
      numArr[i] = ele;
    }
    Arrays.sort(numArr);
    System.out.println(Arrays.toString(numArr));

  }

}
