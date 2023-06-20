package com.careerit.playerstats.service;

import com.careerit.playerstats.dto.RoleStatsDto;
import com.careerit.playerstats.dto.TeamStatsDto;

import java.util.List;

public interface PlayerStatService {

        List<TeamStatsDto> getTeamStats();
        List<RoleStatsDto> getRoleStats(String team);
}
