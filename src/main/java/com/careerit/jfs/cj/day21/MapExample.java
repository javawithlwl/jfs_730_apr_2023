package com.careerit.jfs.cj.day21;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1001, "Krish");
        map.put(1002, "Manoj");
        map.put(1003, "Charan");
        map.put(1004, "Tanvi");
        map.put(1001,"Krishna");
        System.out.println(map);
  }
}
