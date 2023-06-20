package com.careerit.jfs.cj.day20;

import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

  public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list
            .stream()
            .map(ele->ele*2)
            .filter(ele->ele>=10 && ele<=50)
            .skip(2)
            .limit(2)
            .collect(Collectors.toList()).stream()
            .mapToInt(ele->ele/2).forEach(System.out::println);

  }
}
