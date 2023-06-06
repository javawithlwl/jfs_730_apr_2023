package com.careerit.jfs.cj.day24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ExceptionExample3 {
  public static void main(String[] args) {

    try {
      m1();
    } catch (IOException e) {
      e.printStackTrace();
    }
    m4();
  }


  public static void m1() throws IOException {
    System.out.println("Start of m1");
    m2();
    System.out.println("End of m1");
  }

  public static void m2() throws IOException {
    System.out.println("Start of m2");
    m3();
    System.out.println("End of m2");
  }
  public static void m4() throws NumberFormatException {
    System.out.println("Start of m4");
    int num = Integer.parseInt("1234");
    System.out.println("End of m4");
  }
  public static void m3() throws IOException {
    List<String> list = Files.readAllLines(new File(CheckedExceptionExample.class.getResource("sample.txt").getFile()).toPath());
    System.out.println(list);
  }
}


