package com.careerit.jfs.cj.day23;

import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.push(1000);
    stack.push(2000);
    stack.push(3000);
    stack.push(4000);
    stack.push(5000);
    System.out.println(stack.peek());
    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack);
  }
}
