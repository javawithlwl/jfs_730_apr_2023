package com.careerit.jfs.cj.day21;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

  public static void main(String[] args) {

    Set<String> names = new HashSet<>();
    names.add("Krish");
    names.add("Manoj");
    names.add("Charan");
    names.add("Krish");
    names.add("Charan");

    System.out.println(names);

    for(String name:names) {
      System.out.println(name);
    }
    names.stream().forEach(System.out::println);
  }
}
