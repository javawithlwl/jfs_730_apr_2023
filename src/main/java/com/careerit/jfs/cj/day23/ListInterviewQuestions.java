package com.careerit.jfs.cj.day23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListInterviewQuestions {

  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<>();
//    list.add(1000);
//    list.add(2000);
//    list.add(3000);
//
//    System.out.println(list.get(1));
//    list.remove(Integer.valueOf(2000));
//    System.out.println(list);
//    showElements();
    addElements();
    biggestElement();
  }

  public static void showElements() {
    List<Integer> list = IntStream.rangeClosed(1, 100).boxed().toList();
    int n = 25;
    list.stream().skip(list.size() - n).forEach(System.out::println);
  }

  public static void addElements() {
    List<List<Integer>> list = new ArrayList<>();
    list.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    list.add(List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    list.add(List.of(21, 22, 23, 24, 25, 26, 27, 28, 29, 30));
    list.add(List.of(1, 11, 21, 31, 41, 51, 61, 71, 81, 91));

//    List<Integer> allElements = new ArrayList<>();
//    for (List<Integer> l : list) {
//      allElements.addAll(l);
//    }
//    List<Integer> diviBy3 = new ArrayList<>();
//    for (int ele : allElements) {
//      if (ele % 3 == 0) {
//        diviBy3.add(ele);
//      }
//    }
    list.parallelStream()
        .flatMap(ele -> ele.stream())
        .collect(Collectors.toList())
        .stream()
        .filter(ele -> ele % 3 == 0)
        .forEach(e -> System.out.print(e + " "));


  }

  public static void biggestElement() {
    List<Integer> list = IntStream.generate(() -> (int) (Math.random() * 1000)).limit(30).boxed().toList();
    // Biggest and smallest element
    int max = list.stream().max(Integer::compare).get();
    int min = list.stream().min(Integer::compare).get();
    System.out.println("Biggest element :" + max);
    System.out.println("Smallest element :" + min);
  }

  public static void isPalindrome() {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1);
    boolean flag = true;
    for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
      if (list.get(i) != list.get(j)) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }

  public static List<Integer> removeDuplicates(List<Integer> list){
//      List<Integer> resList = new ArrayList<>();
//      for(int ele:list){
//          if(!resList.contains(ele)){
//              resList.add(ele);
//          }
//      }
//      return resList;
//      List<Integer> resList = new ArrayList<>(new HashSet<>(list));
//      return resList;

      return list.stream().distinct().toList();

  }


  // Stack
    // q: what is stack in java
    // a: stack is a data structure which follows LIFO (Last In First Out) principle
    // q: what are the methods available in stack
    // a: push, pop, peek, search, empty
    // q: what is the difference between peek and pop
    // a: peek will return the top element from the stack but pop will remove the top element from the stack



  // Queue
  // LinkedList

}


