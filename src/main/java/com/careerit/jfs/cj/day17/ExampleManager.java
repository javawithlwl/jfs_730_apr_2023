package com.careerit.jfs.cj.day17;

class T1 {
  void m1() {
    System.out.println("T1 class m1 method");
  }
}

class T2 extends T1 {
  void m1() {
    System.out.println("T2 class m1 method");
  }

  void m2() {
    System.out.println("T2 class m2 method");
  }
}

public class ExampleManager {

  public static void main(String[] args) {
    T1 obj = new T2();
    if (obj instanceof T2 obj1) {
      obj1.m1();
      obj1.m2();
    }

  }
}
