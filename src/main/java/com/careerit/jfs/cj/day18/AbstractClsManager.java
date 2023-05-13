package com.careerit.jfs.cj.day18;

abstract class T1 {
  T1() {
    super();
    System.out.println("T1 class constructor");
  }
}

abstract class T2 extends T1 {
  T2() {
    super();
    System.out.println("T2 class constructor");
  }
}

class T3 extends T2 {
  T3() {
    super();
    System.out.println("T3 class constructor");
  }
}

public class AbstractClsManager {
  public static void main(String[] args) {
    T1 obj = new T3();

  }
}
