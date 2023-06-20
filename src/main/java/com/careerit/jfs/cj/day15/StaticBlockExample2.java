package com.careerit.jfs.cj.day15;

class One {
  static {
    System.out.println("I am static block of One");
  }
  public static void greet(){
    System.out.println("Hello");
  }
}

public class StaticBlockExample2 {

  static {
    System.out.println("I am static block of StaticBlockExample2");
  }

  public static void main(String[] args) {
    System.out.println("I am main method");
    One.greet();
  }

}
