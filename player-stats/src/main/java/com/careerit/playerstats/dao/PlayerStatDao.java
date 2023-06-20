package com.careerit.playerstats.dao;

import com.careerit.playerstats.dto.RoleStatsDto;
import com.careerit.playerstats.dto.TeamStatsDto;

import java.util.List;

public interface PlayerStatDao {

    List<TeamStatsDto> selectTeamStats();
    List<RoleStatsDto> selectRoleStats(String team);
}
