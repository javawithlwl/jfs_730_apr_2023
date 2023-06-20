package com.careerit.sc.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("greetings-bean.xml");
    GreetingService gs = context.getBean(GreetingService.class);
    System.out.println(gs.getMessage());

    DbConfiguration dbConfiguration = context.getBean(DbConfiguration.class);
    System.out.println(dbConfiguration);

  }
}
