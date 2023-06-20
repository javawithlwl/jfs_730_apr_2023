package com.careerit.jfs.cj.day9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReadDataFromFile {

  public static void main(String[] args) throws IOException {
    File file = new File(ReadDataFromFile.class.getResource("/randomdata.txt").getFile());
    List<String> lines = Files.readAllLines(file.toPath());
    for(int i=0;i<lines.size();i++){
      System.out.println(lines.get(i));
    }
  }
}
