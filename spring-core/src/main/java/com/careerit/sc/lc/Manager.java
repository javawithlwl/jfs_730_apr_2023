package com.careerit.sc.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.lc")
public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    FileReaderUtil fileReaderUtil = context.getBean(FileReaderUtil.class);
    fileReaderUtil.service();
    ((AnnotationConfigApplicationContext) context).close();
  }
}
