package com.careerit.jfs.cj.day9;

import java.util.Arrays;

public class GeneratePrimes {


  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 3, 5, 7, 9};
    int[] arr2 = new int[]{2, 4, 6, 8, 10};
    // Add arr1 and arr2 elements into another array sort them and display the same

    int[] arr = new int[arr1.length + arr2.length];
    int c = 0;
    for (int i = 0; i < arr1.length; i++) {
      int ele = arr1[i];
      arr[c++] = ele;
    }
    for (int i = 0; i < arr2.length; i++) {
      int ele = arr2[i];
      arr[c++] = ele;
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // Remove the element in 5th location
    int[] tmp = new int[arr.length - 1];
//    for (int i = 0, count = 0; i < arr.length; i++) {
//      if (i == 5) {
//        continue;
//      }
//      tmp[count++] = arr[i];
//    }
    System.arraycopy(arr,0,tmp,0,5);
    System.arraycopy(arr,6,tmp,5,arr.length-6);

    System.out.println(Arrays.toString(tmp));

  }

  private static int[] generatePrimeInRange(int lb,int ub){
      return null;
  }
}
