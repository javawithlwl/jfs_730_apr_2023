package com.careerit.jfs.cj.day24;

class TaskManager  {
  private TaskManager() {
  }

  private static TaskManager obj = null;

  public static TaskManager getInstance() {
    if (obj == null) {
      synchronized (TaskManager.class) {
        obj = new TaskManager();
      }
    }
    return obj;
  }
  public TaskManager clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Cloning not supported");
  }
}

public class QuestionOnException {

  public static void main(String[] args) {
    TaskManager obj1 = TaskManager.getInstance();
    TaskManager obj2 = TaskManager.getInstance();

    try {
      TaskManager obj3 = obj1.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }
}
