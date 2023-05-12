package com.careerit.jfs.cj.day17;

class One {
  int a = 99;

  public One(int num) {
    System.out.println("One class constructor");
  }

  public void m1() {
    System.out.println("One class m1 method");
  }
}

class Two extends One {
  int a = 999;

  public Two() {
    super(10);
    System.out.println("Two class constructor");
  }

  public void m2() {
    System.out.println("Two class m2 method");
  }

  public void m1() {
    System.out.println("Two class m1 method");
  }

  public void show() {
    System.out.println(a);
    System.out.println(super.a);
    m1();
  }
}

public class SuperMethodKeyword {
  public static void main(String[] args) {

  }

}
