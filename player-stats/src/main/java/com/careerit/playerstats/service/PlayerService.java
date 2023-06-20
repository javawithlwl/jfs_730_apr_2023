package com.careerit.playerstats.service;

import com.careerit.playerstats.domain.Player;
import com.careerit.playerstats.dto.PlayerDto;

import java.util.List;

public interface PlayerService {
  PlayerDto addPlayer(PlayerDto playerDto);

  List<PlayerDto> getPlayers();

  PlayerDto getPlayerById(long id);

  PlayerDto updatePlayer(PlayerDto player);

  boolean deletePlayer(long id);

  List<PlayerDto> search(String str);

  List<PlayerDto> addPlayers(List<PlayerDto> players);
}
