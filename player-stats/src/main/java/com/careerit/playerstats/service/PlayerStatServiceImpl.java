package com.careerit.playerstats.service;

import com.careerit.playerstats.dao.PlayerStatDao;
import com.careerit.playerstats.dto.RoleStatsDto;
import com.careerit.playerstats.dto.TeamStatsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerStatServiceImpl implements PlayerStatService {
  private final PlayerStatDao playerStatDao;

  @Override
  public List<TeamStatsDto> getTeamStats() {
    return playerStatDao.selectTeamStats();
  }

  @Override
  public List<RoleStatsDto> getRoleStats(String team) {
    Assert.notNull(team, "Team name can't be null");
    return playerStatDao.selectRoleStats(team);
  }
}
