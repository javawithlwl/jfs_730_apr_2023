package com.careerit.sjdbc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
@Slf4j
public class JdbcCRUDOperations {


  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  // insert data into a table
  public void insertData() {
    String sql = "insert into product(name,price) values(?,?)";
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(con -> {
      PreparedStatement pst = con.prepareStatement(sql, new String[]{"id"});
      pst.setString(1, "Lenovo ThinkPad");
      pst.setDouble(2, 45000.00);
      return pst;
    }, keyHolder);
    if(keyHolder.getKey() != null){
      long id = keyHolder.getKey().longValue();
      log.info("Generated key is :{} ",id);
    }
  }

  // get players data
  public List<Player> getPlayerData() {
    String sql = "select name,role,amount,country,team from player";
    return jdbcTemplate.query(sql, new PlayerMapper());
  }

  public List<Player> getPlayers(String teamName) {
    String sql = "select name,role,amount,country,team from player where team = ?";
    return jdbcTemplate.query(sql, new PlayerMapper(),teamName);
  }

  public List<String> getTeamName() {
    String sql = "select distinct team from player";
    return jdbcTemplate.queryForList(sql, String.class);
  }

  public List<TeamStatDto> getPlayerCountOfEachTeam() {
    String sql = "select team,count(name) as count,sum(amount) as total_amount  from player group by team";
    return jdbcTemplate.query(sql, (rs, rowNum) -> {
      TeamStatDto teamStatDto = new TeamStatDto();
      teamStatDto.setTeam(rs.getString("team"));
      teamStatDto.setCount(rs.getInt("count"));
      teamStatDto.setTotalAmount(rs.getDouble("total_amount"));
      return teamStatDto;
    });
  }

  public List<Player> getPlayers(String team,String role){
      String sql = "select name,role,amount,country,team from player where team =:teamName and role =:roleName";
      MapSqlParameterSource map = new MapSqlParameterSource("teamName", team)
        .addValue("roleName", role);
      return namedParameterJdbcTemplate.query(sql,map,new PlayerMapper());
  }

}
