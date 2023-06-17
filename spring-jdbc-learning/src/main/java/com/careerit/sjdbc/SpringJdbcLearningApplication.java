package com.careerit.sjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringJdbcLearningApplication implements CommandLineRunner {

	@Autowired
	private JdbcCRUDOperations jdbcCRUDOperations;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			//jdbcCRUDOperations.insertData();
//		List<Player> list = jdbcCRUDOperations.getPlayerData();
//
//		for(Player player:list){
//			System.out.println(player);
//		}
//
//		System.out.println(jdbcCRUDOperations.getPlayerCountOfEachTeam());

		System.out.println(jdbcCRUDOperations.getPlayers("RCB","Batsman"));
	}
}
