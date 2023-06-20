package com.careerit.jfs.cj.day7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample1 {

  public static void main(String[] args) {

    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("The sum is :" + sum);
    double avg = sum / (double) arr.length;
    System.out.println("Average is :" + avg);
    String[] names = new String[]{"Krish", "Manoj", "Charan", "Kiran", "Rajesh", "Mahesh"};
    System.out.println(names.length);
    for (int i = names.length -1; i >= 0; i--) {
      String name = names[i];
      System.out.println(name);
    }
    for(int i = 1;i<names.length-2;i++){
      System.out.println(names[i]);
    }
    for(String name:names){
        System.out.println(name);
    }
  }


}
