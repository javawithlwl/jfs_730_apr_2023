package com.careerit.jfs.cj.day19.playerstats;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CsvReaderUtil {

      private CsvReaderUtil(){
      }

      public static List<Player> loadDataFromFile(){
          String fileName = "/player.csv";
        List<Player> players = new ArrayList<>();
        try {
          List<String> data = Files.readAllLines(new File(CsvReaderUtil.class.getResource(fileName).getFile()).toPath());
          for(int i=1;i<data.size();i++){
            String row = data.get(i);
            String[] arr = row.split(",");
            String name = arr[0];
            String role = arr[1];
            double amount = Double.parseDouble(arr[2]);
            String country = arr[3];
            String team = arr[4];
            players.add(new Player(name, Role.getRole(role), country, amount, team));
          }
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        return players;

      }

  public static void main(String[] args) {
    System.out.println(loadDataFromFile().size());
  }
}
