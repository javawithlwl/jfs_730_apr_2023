package com.careerit.jfs.cj.day24;

import java.io.Closeable;
import java.util.Scanner;

class MyDbConnection implements Closeable {

  public MyDbConnection() {
    System.out.println("Connection is created");
  }

  public void executeQuery(String query) {
    System.out.println("Query is executed");
  }

  @Override
  public void close() {
    System.out.println("Connection is closed");
  }
}

public class TryWithResourceHandling {
  public static void main(String[] args) {
    try (MyDbConnection con = new MyDbConnection()) {
      con.executeQuery("select * from emp");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
