package com.careerit.jfs.cj.day22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {


  public static void main(String[] args) {

    Map<String,Integer> map = new HashMap<>();
    map.put("Krish", 5);
    map.put("Charan",6);
    map.put("Manoj", 5);
    map.put("Tanvi", 5);

    Set<String> keys = map.keySet();
    for(String key:keys) {
      System.out.println(key+" : "+map.get(key));
    }

    Collection<Integer> values = map.values();

    for(Integer value:values) {
      System.out.println(value);
    }

    Set<Map.Entry<String,Integer>> entries = map.entrySet();

    for(Map.Entry<String,Integer> entry:entries) {
      System.out.println(entry.getKey()+" : "+entry.getValue());
    }
    map.entrySet().stream().forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));

    map.putIfAbsent("Ramesh",6);

    map.put("Ramesh",10);

    System.out.println(map.get("Ramesh"));
  }



}
