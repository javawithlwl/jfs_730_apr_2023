package com.careerit.jfs.cj.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExampleWithArrays {

  public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9,10};

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.stream(arr1).boxed().toList());
        list.addAll(Arrays.stream(arr2).boxed().toList());

        System.out.println(list);

  }
}
