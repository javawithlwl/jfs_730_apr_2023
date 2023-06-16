package com.careerit.sc.basics.scopes;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskManager {

  public void showTaskList() {
    System.out.println("Task list");
  }
}
