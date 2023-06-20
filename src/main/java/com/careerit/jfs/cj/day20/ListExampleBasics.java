package com.careerit.jfs.cj.day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExampleBasics {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("Manoj");
    list.add("Charan");
    list.add("Krish");
    list.add("Manoj");
    list.add("Charan");
    list.add("Manohar");

    System.out.println(list);
    System.out.println(list.get(3));
    System.out.println(list.isEmpty());
    System.out.println(list.size());
    System.out.println("-".repeat(50));
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println("-".repeat(50));
    for (String ele : list) {
      System.out.println(ele);
    }
    System.out.println("-".repeat(50));

    list.forEach(ele->System.out.println(ele));

    System.out.println("-".repeat(50));

    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      if(itr.next().equals("Manoj")) {
        itr.remove();
      }
    }
    System.out.println(list);

    System.out.println("-".repeat(50));

    ListIterator<String> listItr = list.listIterator();
    while(listItr.hasNext()) {
      String ele = listItr.next();
      System.out.println(ele);
    }
    System.out.println("-".repeat(50));
    while(listItr.hasPrevious()) {
      String ele = listItr.previous();
      System.out.println(ele);
    }

    list.remove(2);
    System.out.println(list);

    List<String> girlsList = new ArrayList<>();
    girlsList.add("Laxmi");
    girlsList.add("Sita");
    girlsList.add("Radha");

    list.addAll(girlsList);
    System.out.println(list);

    System.out.println(list.contains("Manoj"));
    System.out.println(list.containsAll(girlsList));

    list.add(2, "Rama");
    list.add(3,"Krishna");
    System.out.println(list);
    list.set(2, "Rama Krishna");
    System.out.println(list);
  }
}
