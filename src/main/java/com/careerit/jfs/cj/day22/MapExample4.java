package com.careerit.jfs.cj.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample4 {

  public static void main(String[] args) {

    List<List<Integer>> list = new ArrayList<>();
    list.add(List.of(1, 2, 3));
    list.add(List.of(4, 5, 6));
    list.add(List.of(7, 8, 9));
    list.add(List.of(10, 11, 12));

//        List<Integer> numList = new ArrayList<>();
//        for(List<Integer> l:list) {
//          numList.addAll(l);
//        }

    List<Integer> numList = list.stream().flatMap(e -> e.stream()).toList();
    System.out.println(numList);
  }
}
