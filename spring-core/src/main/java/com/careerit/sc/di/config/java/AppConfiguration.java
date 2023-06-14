package com.careerit.sc.di.config.java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

      @Bean
      public ContactDao contactDao(){
            return new ContactDaoImpl();
      }
      @Bean
      public ContactService contactService(){
            ContactServiceImpl contactService = new ContactServiceImpl();
            contactService.setContactDao(contactDao());
            return contactService;
      }
}
