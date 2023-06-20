package com.careerit.jfs.cj.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NumberOperationsUsingList {

  public static void main(String[] args) {

    List<Integer> list = getRandomNumbers();

    List<Integer> evenList = getEvenList(list);
    System.out.println("Even list :"+evenList);
    List<Integer> oddList = getOddList(list);
    System.out.println("Odd list :"+oddList);
    List<Integer> divisibleBy3List = getDivisibleBy3List(list);
//    List<Integer> sortedList = getSortedList(list);
     List<Integer> reverseList = getReverseList(list);
     List<Integer> primeList = getPrimeList(list);

  }
  private static boolean isPrime(int num) {
    if(num < 2){
      return false;
    }
    for(int i=2;i<=num/2;i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }

  private static List<Integer> getPrimeList(List<Integer> list) {
      return list.stream().filter(ele->isPrime(ele)).toList();
  }

  private static List<Integer> getReverseList(List<Integer> list) {
    List<Integer> reverseList = new ArrayList<>();
    for(int i=list.size()-1;i>=0;i--){
      reverseList.add(list.get(i));
    }
    return reverseList;
  }

  private static List<Integer> getDivisibleBy3List(List<Integer> list) {
    return list.stream().filter(ele->ele%3==0).toList();
  }
  // Get element divisible by 3 and double the number and filter the number greater than 50
  private static List<Integer> getFilteredList(List<Integer> list){
//    List<Integer> divisibleBy3List = new ArrayList<>();
//    for(Integer ele:list){
//      if(ele%3==0){
//        divisibleBy3List.add(ele);
//      }
//    }
//    List<Integer> doubleList = new ArrayList<>();
//    for(Integer ele:divisibleBy3List){
//      doubleList.add(ele*2);
//    }
//    List<Integer> filteredList = new ArrayList<>();
//    for(Integer ele:doubleList){
//      if(ele>50){
//        filteredList.add(ele);
//      }
//    }
//    return filteredList;
    return list.stream()
        .filter(ele->ele%3==0)
        .map(ele->ele*2)
        .filter(ele->ele>50)
        .toList();
  }

  private static List<Integer> getOddList(List<Integer> list) {
//    List<Integer> oddList = new ArrayList<>();
//    for (Integer ele : list) {
//      if (ele % 2 != 0) {
//        oddList.add(ele);
//      }
//    }
//    return oddList;
    return list.stream()
               .filter(ele -> ele % 2 != 0)
               .toList();
  }

  private static List<Integer> getEvenList(List<Integer> list) {
//    List<Integer> evenList = new ArrayList<>();
//    for (Integer ele : list) {
//      if (ele % 2 == 0) {
//        evenList.add(ele);
//      }
//    }
//    return evenList;
    return list.stream()
               .filter(ele -> ele % 2 == 0)
               .toList();
  }

  private static List<Integer> getRandomNumbers() {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 20; i++) {
      int num = ThreadLocalRandom.current().nextInt(10, 101);
      if (!list.contains(num)) {
        list.add(num);
      }
    }
      return list;
    }
}
