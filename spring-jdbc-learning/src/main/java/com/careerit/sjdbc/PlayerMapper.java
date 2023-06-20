package com.careerit.sjdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerMapper implements RowMapper<Player> {
  @Override
  public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        Player player = new Player();
        player.setName(rs.getString("name"));
        player.setRole(rs.getString("role"));
        player.setAmount(rs.getDouble("amount"));
        player.setCountry(rs.getString("country"));
        player.setTeam(rs.getString("team"));
        return player;
  }
}
