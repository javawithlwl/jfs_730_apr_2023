package com.careerit.jfs.cj.day19.playerstats;

public class IplStatsManager {

  public static void main(String[] args) {

        PlayerStatsService playerStatsService = new PlayerStatsServiceImpl();
        System.out.println(playerStatsService.teamName());

  }
}
