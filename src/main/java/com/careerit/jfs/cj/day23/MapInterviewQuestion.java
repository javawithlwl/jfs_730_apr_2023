package com.careerit.jfs.cj.day23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapInterviewQuestion {

  public static void main(String[] args) {
    System.out.println(getNameAndSize(List.of("Krish", "Manoj", "Charan", "Tanvi")));
  }

    public static Map<String,Integer> getNameAndSize(List<String> names){
//        Map<String,Integer> map = new HashMap<>();
//        for(String name:names){
//            map.put(name, name.length());
//        }
//        return map;
      return names.stream().collect(Collectors.toMap(Function.identity(),String::length));
    }

    // Employee => id,name ( hashcode and equals)

}
