package com.careerit.jfs.cj.day15;

public final class TaskManager {
  private static TaskManager obj;

  private TaskManager() {
  }

  public void showCurrentTasks() {
    System.out.println("Show all the tasks");
  }

  public synchronized  static TaskManager getInstance() {
    if (obj == null) {
      obj = new TaskManager();
    }
    return obj;
  }

}
