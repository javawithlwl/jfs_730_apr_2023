package com.careerit.jfs.cj.day24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CheckedExceptionExample {

  public static void main(String[] args)  {

    try {
      List<String> list = Files.readAllLines(new File(CheckedExceptionExample.class.getResource("/names.txt").getFile()).toPath());
      for(String name:list){
        System.out.println(name);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
