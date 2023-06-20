package com.careerit.jfs.cj.day22;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample3 {

  public static void main(String[] args) {
        String data = "CS-GLN,ALN,NN:IS-NVR,KVR,GVR:EC-GLN,SDK,DK,PKM";
        Map<String, List<String>> mapDeptEmps = new HashMap<>();
        String[] arr = data.split(":");
        for(String str:arr) {
          String[] subArr = str.split("-");
          String dept = subArr[0];
          String[] empArr = subArr[1].split(",");
          mapDeptEmps.put(dept, List.of(empArr));
        }
        System.out.println(mapDeptEmps);

    Set<String> names = mapDeptEmps.values().stream().flatMap(e->e.stream()).collect(Collectors.toSet());
    System.out.println(names);
  }
}
