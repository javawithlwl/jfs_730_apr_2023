package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class SearchElement {

  public static void main(String[] args) {
    System.out.println(isAnagram("CAT","BAC"));
  }

  // If key is present in the given input array then return index otherwise return -1
  private static int getIndex(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  private static boolean isSubSet(int[] masterArr, int[] subArr) {
    if (masterArr.length < subArr.length) {
      return false;
    }
    for (int ele : subArr) {
      if (getIndex(masterArr, ele) == -1) {
        return false;
      }
    }
    return true;
  }

  // cat => tac => act
  private static boolean isAnagram(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    char[] arr1 = word1.toCharArray();
    char[] arr2 = word2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
  }
  // Return the biggest element of the given array
  private static int biggest(int[] arr){
        int max = arr[0];
        for(int ele:arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
  }
  private static int min(int[] arr){
    int min = arr[0];
    for(int ele:arr){
      if(ele < min){
        min = ele;
      }
    }
    return min;
  }

  private static Employee maxPaidEmployee(Employee[] empArr){
        double maxSal = getMaxSalary(empArr);
        for(Employee emp:empArr){
            if(emp.getSalary() == maxSal){
              return emp;
            }
        }
        throw new IllegalArgumentException("No max paid employees");
  }
  private static double getMaxSalary(Employee[] empArr){
        double max = empArr[0].getSalary();
        for(Employee ele:empArr){
              if(max < ele.getSalary()){
                  max = ele.getSalary();
              }
        }
        return max;
  }


}
