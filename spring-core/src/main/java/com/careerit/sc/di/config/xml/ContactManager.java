package com.careerit.sc.di.config.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactManager {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("contact-bean.xml");
        ContactService contactService = context.getBean(ContactService.class);
        System.out.println(contactService.getContactNames());
  }
}
