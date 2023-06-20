package com.careerit.jfs.cj.day11;

import java.util.Scanner;

public class StringExampleReadingFileData {

  public static void main(String[] args) {
    Scanner sc = new Scanner(StringExampleReadingFileData.class.getResourceAsStream("/names.txt"));
    String data = "";
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      data = data + line + ",";
    }
    System.out.println(data.substring(0, data.length() - 1));
  }
}
