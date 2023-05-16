package com.careerit.jfs.cj.day19.playerstats;

import java.util.List;

public interface PlayerStatsService {

      List<String> teamName();
      List<TeamStatsDto> getTeamStats();
      List<RoleStatDto> getRoleStat();
      List<Player> maxPaidPlayers(int n);
      List<Player> searchByName(String name);
      List<Player> getPlayerAmountBetween(double min,double max);
      List<Player> getPlayerByCountry(String country);
      List<Player> getPlayerByRole(Role role);
      List<Player> getPlayerByTeam(String team);
}
