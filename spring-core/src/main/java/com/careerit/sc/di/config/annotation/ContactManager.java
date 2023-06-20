package com.careerit.sc.di.config.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.di.config.annotation")
public class ContactManager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ContactManager.class);
    ContactService contactService = context.getBean(ContactService.class);
    System.out.println(contactService.getContactNames());
  }
}
