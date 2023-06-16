package com.careerit.sc.lc;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class FileReaderUtil {

  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("Destroy method");
  }
  @PostConstruct
  public void init() throws Exception {
    System.out.println("After properties set");
  }
  public void service() {
    System.out.println("Service method all");
  }
}
