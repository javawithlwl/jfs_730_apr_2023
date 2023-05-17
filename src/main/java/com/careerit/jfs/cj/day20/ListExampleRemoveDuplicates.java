package com.careerit.jfs.cj.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListExampleRemoveDuplicates {

  public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // generate 1 to 100 25 unique random numbers and add to list
        while(list.size()!=25) {
          int random = ThreadLocalRandom.current().nextInt(1,101);
          if(!list.contains(random)) {
            list.add(random);
          }
        }
        System.out.println(list);

  }
}
