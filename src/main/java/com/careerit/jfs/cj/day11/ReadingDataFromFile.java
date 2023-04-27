package com.careerit.jfs.cj.day11;

import com.careerit.jfs.cj.day9.ReadDataFromFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadingDataFromFile {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(ReadingDataFromFile.class.getResourceAsStream("/names.txt"));
    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      System.out.println(str.toUpperCase());
    }

  }
}
