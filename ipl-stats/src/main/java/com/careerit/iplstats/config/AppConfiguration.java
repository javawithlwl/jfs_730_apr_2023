package com.careerit.iplstats.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration {
  @Bean
  public ObjectMapper objectMapper() {
    ObjectMapper obj = new ObjectMapper();
    obj.registerModule(new JavaTimeModule());
    return obj;
  }

}
