package com.careerit.playerstats.dao;

import com.careerit.playerstats.domain.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PlayerDaoImpl implements PlayerDao {

  private final JdbcTemplate jdbcTemplate;
  private final String INSERT_PLAYER = "insert into player_details(name,team,country,role,amount) values(?,?,?,?,?)";
  private final String SELECT_PLAYER_BY_ID = "select * from player_details where id = ?";
  @Override
  public Player insertPlayer(Player player) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(con -> {
      PreparedStatement ps = con.prepareStatement(INSERT_PLAYER, new String[]{"id"});
      ps.setString(1, player.getName());
      ps.setString(2, player.getTeam());
      ps.setString(3, player.getCountry());
      ps.setString(4, player.getRole());
      ps.setDouble(5, player.getAmount());
      return ps;
    }, keyHolder);
    long id = keyHolder.getKey().longValue();
    player.setId(id);
    return player;
  }

  @Override
  public List<Player> selectPlayers() {
    return null;
  }

  @Override
  public Player getPlayerById(long id) {
    List<Player> list = jdbcTemplate.query(SELECT_PLAYER_BY_ID, new Object[]{id}, playerRowMapper);
    if (list.size() == 1) {
      return list.get(0);
    }
    return null;
  }

  @Override
  public Player updatePlayer(Player player) {
    return null;
  }

  @Override
  public boolean deletePlayer(long id) {
    return false;
  }

  @Override
  public List<Player> search(String str) {
    return null;
  }

  @Override
  public int insertPlayers(List<Player> players) {
    return 0;
  }

  private RowMapper<Player> playerRowMapper = (rs, rowNum) -> {
    Player player = new Player();
    player.setId(rs.getLong("id"));
    player.setName(rs.getString("name"));
    player.setTeam(rs.getString("team"));
    player.setCountry(rs.getString("country"));
    player.setRole(rs.getString("role"));
    player.setAmount(rs.getDouble("amount"));
    return player;
  };

}
