package com.careerit.jfs.cj.day13;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private List<Player> playerList;

    public PlayerService() {
      playerList = new ArrayList<>();
      try{
      List<String> lines = Files.readAllLines(new File(PlayerService.class.getResource("/players.csv").getFile()).toPath());
      lines.remove(0);
      for(String line:lines) {
        String[] arr = line.split(",");
        String name = arr[0];
        String role = arr[1];
        double amount = Double.parseDouble(arr[2]);
        String country = arr[3];
        String team = arr[4];
        Player player = new Player(name, role, amount, country, team);
        playerList.add(player);
      }
      }catch (Exception e){
        e.printStackTrace();
      }
    }
    // Player with given country
    public void showPlayers(String country){

    }
    // Players with given country and team
    public void showPlayers(String country,String team){

    }
    // Player with given country,team and role
    public void showPlayers(String country,String team,String role){

    }
    // Players with amount greater than given amount
    public void showAmount(double amount){

    }
    // Players with amount between min and max
    public void showAmount(double minAmount,double maxAmount){

    }

}
