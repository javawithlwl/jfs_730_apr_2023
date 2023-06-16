package com.careerit.sc.basics.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.basics.scopes")
public class Manager {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    TaskManager taskManager1 = context.getBean(TaskManager.class);
    TaskManager taskManager2 = context.getBean(TaskManager.class);
    TaskManager taskManager3 = context.getBean(TaskManager.class);
    System.out.println(taskManager1);
    System.out.println(taskManager2);
    System.out.println(taskManager3);

    ApplicationContext context1 = new AnnotationConfigApplicationContext(Manager.class);
    TaskManager taskManager4 = context1.getBean(TaskManager.class);
    TaskManager taskManager5 = context1.getBean(TaskManager.class);
    TaskManager taskManager6 = context1.getBean(TaskManager.class);
    System.out.println(taskManager4);
    System.out.println(taskManager5);
    System.out.println(taskManager6);
  }
}
