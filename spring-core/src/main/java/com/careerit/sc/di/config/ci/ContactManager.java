package com.careerit.sc.di.config.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.di.config.ci")
public class ContactManager {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(ContactManager.class);
    ContactService contactService = context.getBean(ContactService.class);
    System.out.println(contactService.getContactNames());
  }
}
