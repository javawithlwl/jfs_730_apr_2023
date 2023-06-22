package com.careerit.sjl;

import com.careerit.sjl.domain.Course;
import com.careerit.sjl.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaLearningApplication{



  public static void main(String[] args) {
    SpringApplication.run(SpringJpaLearningApplication.class, args);
  }


}
