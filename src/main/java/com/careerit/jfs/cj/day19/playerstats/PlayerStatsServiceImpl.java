package com.careerit.jfs.cj.day19.playerstats;

import java.util.ArrayList;
import java.util.List;

public class PlayerStatsServiceImpl implements PlayerStatsService {

  private List<Player> players;

  public PlayerStatsServiceImpl(){
    this.players = CsvReaderUtil.loadDataFromFile();
  }
  @Override
  public List<String> teamName() {
    List<String> teamNames = new ArrayList<>();
    for(Player p:players){
        String team = p.getTeam();
        if(!teamNames.contains(team)){
            teamNames.add(team);
        }
    }
    return teamNames;
  }

  @Override
  public List<TeamStatsDto> getTeamStats() {
    return null;
  }

  @Override
  public List<RoleStatDto> getRoleStat() {
    return null;
  }

  @Override
  public List<Player> maxPaidPlayers(int n) {
    return null;
  }

  @Override
  public List<Player> searchByName(String name) {
    return null;
  }

  @Override
  public List<Player> getPlayerAmountBetween(double min, double max) {
    return null;
  }

  @Override
  public List<Player> getPlayerByCountry(String country) {
    return null;
  }

  @Override
  public List<Player> getPlayerByRole(Role role) {
    return null;
  }

  @Override
  public List<Player> getPlayerByTeam(String team) {
    return null;
  }
}
