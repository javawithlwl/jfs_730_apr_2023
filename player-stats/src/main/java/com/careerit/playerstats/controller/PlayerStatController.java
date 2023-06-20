package com.careerit.playerstats.controller;

import com.careerit.playerstats.dto.RoleStatsDto;
import com.careerit.playerstats.dto.TeamStatsDto;
import com.careerit.playerstats.service.PlayerStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stats")
@RequiredArgsConstructor
public class PlayerStatController {

    private final PlayerStatService playerStatService;
    @GetMapping("/team")
    public ResponseEntity<List<TeamStatsDto>> getTeamStats(){
      List<TeamStatsDto> list = playerStatService.getTeamStats();
      return  ResponseEntity.ok(list);
    }

    @GetMapping("/{team}")
    public ResponseEntity<List<RoleStatsDto>> getRoleStats(@PathVariable("team") String team){
      List<RoleStatsDto> list = playerStatService.getRoleStats(team);
      return  ResponseEntity.ok(list);
    }

}
