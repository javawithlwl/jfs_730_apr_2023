package com.careerit.sc.di.config.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "com.careerit.sc.di.config.java")
public class ContactManager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ContactManager.class);
    ContactService contactService = context.getBean(ContactService.class);
    System.out.println(contactService.getContactNames());
  }
}
