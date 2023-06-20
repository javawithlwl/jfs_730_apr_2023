package com.careerit.sc.basics.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.basics.factory")
public class Manager {

  public static void main(String[] args) {

          ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
          ReportFactory factory = context.getBean(ReportFactory.class);
          ReportService service = factory.getReportService(ReportType.PDF);
          service.generateReport("Hello");

  }
}
