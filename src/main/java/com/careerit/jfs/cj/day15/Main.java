package com.careerit.jfs.cj.day15;

import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {



    Thread t1 = new Thread(() -> {
      TaskManager obj11 = TaskManager.getInstance();
      System.out.println(obj11);
    });
    Thread t2 = new Thread(() -> {
      TaskManager obj112 = TaskManager.getInstance();
      System.out.println(obj112);
    });
    Thread t3 = new Thread(() -> {
      TaskManager obj113 = TaskManager.getInstance();
      System.out.println(obj113);
    });
    t1.start();
    t2.start();
    t3.start();

  }
}
