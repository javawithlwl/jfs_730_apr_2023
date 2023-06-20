package com.careerit.jfs.cj.day21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample2 {

  public static void main(String[] args) {

    Set<Integer> numbers = new LinkedHashSet<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(100);
    numbers.add(90);;
    numbers.add(80);
    numbers.add(70);
    numbers.add(60);
    numbers.add(50);
    numbers.add(10);
    System.out.println(numbers);
  }
}
