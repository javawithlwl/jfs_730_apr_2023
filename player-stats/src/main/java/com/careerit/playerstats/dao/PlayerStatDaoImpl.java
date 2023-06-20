package com.careerit.playerstats.dao;

import com.careerit.playerstats.dto.RoleStatsDto;
import com.careerit.playerstats.dto.TeamStatsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PlayerStatDaoImpl implements PlayerStatDao {
  private static final String TEAM_STATS = """
      select team,count(*) as count,sum(amount) as total,min(amount) as min,
      max(amount) as max,avg(amount) as avg from player_details group by team """;

  private static final String ROLE_STATS_OF_GIVEN_TEAM = """
      select team,role,count(*) as count,sum(amount) as total,min(amount) as min,
      max(amount) as max,avg(amount) as avg from player_details  where team = ?  group by team,role """;

  private final JdbcTemplate jdbcTemplate;

  @Override
  public List<TeamStatsDto> selectTeamStats() {
    return jdbcTemplate.query(TEAM_STATS, (rs, rowNum) -> {
      TeamStatsDto teamStatsDto = new TeamStatsDto();
      teamStatsDto.setTeam(rs.getString("team"));
      teamStatsDto.setCount(rs.getInt("count"));
      teamStatsDto.setTotalAmount(rs.getDouble("total"));
      teamStatsDto.setMinAmount(rs.getDouble("min"));
      teamStatsDto.setMaxAmount(rs.getDouble("max"));
      teamStatsDto.setAvgAmount(rs.getDouble("avg"));
      return teamStatsDto;
    });
  }

  @Override
  public List<RoleStatsDto> selectRoleStats(String team) {
    return jdbcTemplate.query(ROLE_STATS_OF_GIVEN_TEAM,new Object[]{team}, (rs, rowNum) -> {
      RoleStatsDto roleStatsDto = new RoleStatsDto();
      roleStatsDto.setTeam(rs.getString("team"));
      roleStatsDto.setRole(rs.getString("role"));
      roleStatsDto.setCount(rs.getInt("count"));
      roleStatsDto.setTotalAmount(rs.getDouble("total"));
      roleStatsDto.setMinAmount(rs.getDouble("min"));
      roleStatsDto.setMaxAmount(rs.getDouble("max"));
      roleStatsDto.setAvgAmount(rs.getDouble("avg"));
      return roleStatsDto;
    });
  }
}
