package com.careerit.jfs.cj.day9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class PlayerStats {

  public static void main(String[] args) throws IOException {

    // Read entire data from players.csv
    // Convert each row into player object
    // Add all the players into an array
    // Find max amount

    File file = new File(ReadDataFromFile.class.getResource("/players.csv").getFile());
    List<String> lines = Files.readAllLines(file.toPath());
    Player[] players = new Player[lines.size() - 1];

    int c = 0;
    for (int i = 1; i < lines.size(); i++) {
      String row = lines.get(i);
      Player player = convertRowToPlayer(row);
      players[c++] = player;
    }
    double maxAmount = getMaxAmount(players);
    System.out.println("Max amount is :" + maxAmount + " and Min amount is " + getMinAmount(players));
    String team = "RCB";
    System.out.println("Total amount spent by " + team + " " + getTotalAmount(players, team));
    System.out.println(Arrays.toString(getPlayersAmountBetween(players, 5000000, 10000000)));
    Player[] maxPaidPlayers = getMaxPaidPlayers(players);
    for (Player player : maxPaidPlayers) {
      player.showDetails();
    }
  }

  private static double getMaxAmount(Player[] players) {
    double maxAmount = players[0].getAmount();
    for (int i = 1; i < players.length; i++) {
      double amount = players[i].getAmount();
      if (maxAmount < amount) {
        maxAmount = amount;
      }
    }
    return maxAmount;
  }

  private static double getMinAmount(Player[] players) {
    double minAmount = players[0].getAmount();
    for (int i = 1; i < players.length; i++) {
      double amount = players[i].getAmount();
      if (minAmount > amount) {
        minAmount = amount;
      }
    }
    return minAmount;
  }

  private static double getTotalAmount(Player[] arr, String team) {
    double totalAmount = 0;
    for (Player player : arr) {
      if (player.getTeam().equals(team)) {
        totalAmount += player.getAmount();
      }
    }
    return totalAmount;
  }

  private static Player[] getPlayersAmountBetween(Player[] arr, double low, double high) {
    Player[] tmp = new Player[arr.length];
    int i = 0;
    for (Player player : arr) {
      if (player.getAmount() >= low && player.getAmount() <= high) {
        tmp[i++] = player;
      }
    }
    Player[] finalResult = new Player[i];
    System.arraycopy(tmp, 0, finalResult, 0, i);
    return finalResult;
  }

  public static Player[] getMaxPaidPlayers(Player[] arr) {
    double maxAmount = getMaxAmount(arr);
    Player[] tmp = new Player[arr.length];
    int c = 0;
    for (Player player : arr) {
      if (player.getAmount() == maxAmount) {
        tmp[c++] = player;
      }
    }
    Player[] finalArr = new Player[c];
    System.arraycopy(tmp, 0, finalArr, 0, c);
    return finalArr;
  }

  public static Player[] getByRole(Player[] arr, String role) {
    return null;
  }

  public static String[] getUniqueTeamName(Player[] arr) {
    return null;
  }

  public static String[] getUniqueCountryNames(Player[] arr) {
    return null;
  }

  public static Player[] getPlayers(Player[] arr, String teamName, String role) {
    return null;
  }
  public static double getTotalAmount(Player[] arr,String teamName,String role){
      return 0;
  }

  private static Player convertRowToPlayer(String row) {
    String[] arr = row.split(",");
    String name = arr[0];
    String role = arr[1];
    double amount = Double.parseDouble(arr[2]);
    String country = arr[3];
    String team = arr[4];
    Player player = new Player(name, role, amount, country, team);
    return player;
  }
}
