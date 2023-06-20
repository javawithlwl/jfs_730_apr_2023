package com.careerit.jfs.cj.day23;

import java.util.HashSet;
import java.util.Set;

public class FactorialOfNumber {

  public static void main(String[] args) {
    int num = 5;
    int res = fact(num);
    System.out.println(res);
    System.out.println(generateRandomNumbers(10, 1, 50));
  }

  public static int fact(int num) {
    if (num == 1) {
      return 1;
    }
    return num * fact(num - 1);
  }
  // q: what is hashcode in java
  // a: hashcode is a unique number for every object in java  and it is used to store the object in the hash based data structures like HashSet,HashMap,HashTable.
  // q: how set stores user defined objects
  // a: set stores the user defined objects based on the hashcode of the object and
  // if two objects hashcode is same then it uses equals method to check the equality of
  // the object if equals method returns true then it will not store the object otherwise
  // it will store the object

  public static Set<Integer> generateRandomNumbers(int n,int lb,int ub){
        Set<Integer> set = new HashSet<>();
        while(set.size() != n){
            int num = (int)(Math.random()*(ub-lb+1)+lb);
            set.add(num);
        }
        return set;
  }
}
