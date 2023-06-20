package com.careerit.jfs.cj.day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

  public static void main(String[] args) {

    List<Integer> cs = List.of(10, 11, 12, 13, 14);
    List<Integer> is = List.of(15, 16, 10, 11, 17);
    List<Integer> ec = List.of(18, 19, 10, 11, 12);

    List<Integer> allList = new ArrayList<>();
    allList.addAll(cs);
    allList.addAll(is);
    allList.addAll(ec);
    System.out.println(allList);
    List<Integer> uniqueList = new ArrayList<>();
    for(Integer ele:allList){
        if(!uniqueList.contains(ele)){
            uniqueList.add(ele);
        }
    }
    System.out.println(uniqueList);

    List<Integer> workingForAllDeptList = new ArrayList<>();
    for(Integer ele:uniqueList){
        if(cs.contains(ele) && is.contains(ele) && ec.contains(ele)){
            workingForAllDeptList.add(ele);
        }
    }
    System.out.println(workingForAllDeptList);
  }
}
