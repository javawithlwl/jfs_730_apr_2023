package com.careerit.playerstats.service;

import com.careerit.playerstats.dao.PlayerDao;
import com.careerit.playerstats.domain.Player;
import com.careerit.playerstats.dto.PlayerDto;
import com.careerit.playerstats.exception.PlayerNotFoundException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService {

  private final PlayerDao playerDao;
  private final ObjectMapper objectMapper;

  @Override
  public PlayerDto addPlayer(PlayerDto playerDto) {
    Assert.notNull(playerDto, "Player object can't be null");
    Assert.hasText(playerDto.getName(), "Player name can't be empty");
    Assert.hasText(playerDto.getRole(), "Player role can't be empty");
    Assert.hasText(playerDto.getTeam(), "Player team can't be empty");
    Assert.hasText(playerDto.getCountry(), "Player country can't be empty");
    Assert.isTrue(playerDto.getAmount() > 0, "Player amount should be greater than zero");

    Player player = objectMapper.convertValue(playerDto, Player.class);
    player = playerDao.insertPlayer(player);
    playerDto = objectMapper.convertValue(player, PlayerDto.class);
    log.info("Player is added with id {}", playerDto.getId());
    return playerDto;
  }

  @Override
  public List<PlayerDto> getPlayers() {
    List<Player> players = playerDao.selectPlayers();
    return objectMapper.convertValue(players, List.class);
  }

  @Override
  public PlayerDto getPlayerById(long id) {
    Player player = playerDao.getPlayerById(id);
    if (player != null) {
      log.info("Player is found with given id {}", id);
      return objectMapper.convertValue(player, PlayerDto.class);
    }
    log.info("Player with id {} is not found", id);
    throw new PlayerNotFoundException("Player with id " + id + " is not found");
  }

  @Override
  public PlayerDto updatePlayer(PlayerDto playerDto) {
    Assert.notNull(playerDto, "Player object can't be null");
    Assert.isTrue(playerDto.getId()>0, "Player id can't be null");
    Assert.hasText(playerDto.getName(), "Player name can't be empty");
    Assert.hasText(playerDto.getRole(), "Player role can't be empty");
    Assert.hasText(playerDto.getTeam(), "Player team can't be empty");
    Assert.hasText(playerDto.getCountry(), "Player country can't be empty");
    Assert.isTrue(playerDto.getAmount() > 0, "Player amount should be greater than zero");
    Player player = playerDao.updatePlayer(objectMapper.convertValue(playerDto, Player.class));
    log.info("Player with id {} is updated", player.getId());
    return objectMapper.convertValue(player, PlayerDto.class);
  }

  @Override
  public boolean deletePlayer(long id) {
    if (getById(id)) {
      log.info("Player with id {} is deleted", id);
      return playerDao.deletePlayer(id);
    }
    log.info("Player with id {} is not found", id);
    throw new PlayerNotFoundException("Player with id " + id + " is not found");
  }

  @Override
  public List<PlayerDto> search(String str) {
    if (StringUtils.hasText(str)) {
      List<Player> players = playerDao.search(str);
      return objectMapper.convertValue(players, new TypeReference<List<PlayerDto>>() {
      });
    } else {
      return getPlayers();
    }
  }

  @Override
  public List<PlayerDto> addPlayers(List<PlayerDto> players) {
    List<Player> playerList = objectMapper.convertValue(players, new TypeReference<List<Player>>() {
    });
    playerList = playerDao.insertPlayers(playerList);
    log.info("Total {} players are added", playerList.size());
    return objectMapper.convertValue(playerList, new TypeReference<List<PlayerDto>>() {
    });
  }

  private boolean getById(long id) {
    Player player = playerDao.getPlayerById(id);
    return player != null;
  }
}
