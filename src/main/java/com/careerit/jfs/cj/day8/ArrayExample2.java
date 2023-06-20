package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class ArrayExample2 {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
    boolean isPalindrome = true;
    for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if(arr[i]!=arr[j]){
                isPalindrome=false;
                break;
            }
    }
    if(isPalindrome){
      System.out.println(Arrays.toString(arr)+" is a palindrome");
    }else{
      System.out.println(Arrays.toString(arr)+" is not a palindrome");
    }

  }
}
