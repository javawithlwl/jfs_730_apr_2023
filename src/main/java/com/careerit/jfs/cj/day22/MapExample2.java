package com.careerit.jfs.cj.day22;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

  public static void main(String[] args) {
      String data = "learning java is fun to have fun learn java in fun way";
      String[] words = data.split(" ");
      Map<String,Integer> map = new HashMap<>();
      for(String word:words) {
        map.put(word, map.getOrDefault(word, 0)+1);
      }
      System.out.println(map);
  }
}
