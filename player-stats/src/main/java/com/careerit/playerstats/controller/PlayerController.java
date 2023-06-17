package com.careerit.playerstats.controller;

import com.careerit.playerstats.dao.PlayerDao;
import com.careerit.playerstats.dto.PlayerDto;
import com.careerit.playerstats.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/player")
@RequiredArgsConstructor
public class PlayerController {

  private final PlayerService playerService;

  @PostMapping("/add")
  public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto) {
    return ResponseEntity.ok(playerService.addPlayer(playerDto));
  }

  @GetMapping("/{id}")
  public ResponseEntity<PlayerDto> updatePlayer(@PathVariable("id") long id) {
    return ResponseEntity.ok(playerService.getPlayerById(id));
  }


}
