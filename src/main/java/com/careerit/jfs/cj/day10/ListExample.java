package com.careerit.jfs.cj.day10;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {
    System.out.println(generatePrime(20));

    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);
    list1.add(30);

    List<Integer> list2 = new ArrayList<>();
    list2.add(40);
    list2.add(20);
    list2.add(50);

    List<Integer> list = new ArrayList<>();
    list.addAll(list1);
    list.addAll(list2);

    System.out.println(list);
    System.out.println(list.contains(30));
    System.out.println(list.containsAll(list1));

  }

  private static List<Integer> generatePrime(int n) {
    List<Integer> list = new ArrayList<>();
    int i = 2;
    while (list.size() != n) {
      if (isPrime(i)) {
        list.add(i);
      }
      i++;
    }
    return list;
  }

  private static boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
