package com.careerit.sc.di.config.annotation;

import com.careerit.commonutil.Validations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

      @Bean
      public Validations validators(){
            return new Validations();
      }
}
