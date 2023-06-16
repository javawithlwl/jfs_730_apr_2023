package com.careerit.sbl;

import com.careerit.sbl.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearningApplication implements CommandLineRunner {
	@Autowired
	private ContactDao contactDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot");
		System.out.println(contactDao.getContactCount());
	}
}
