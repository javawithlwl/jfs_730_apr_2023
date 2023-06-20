package com.careerit.jfs.cj.day16;

public class Manager {
  public static void main(String[] args) {
    Student student = new Student(1001, "Krish", 2021, 1);
    student.showDetails();
    Student student1 = student.promote();
    student1.showDetails();
    Student student2 = student1.promote();
    student2.showDetails();
    student.showDetails();

    String data = "Krish how are u?";
    String info1 = data.substring(0, 5).toUpperCase();
    String info2 = data.substring(0,6).toUpperCase().trim();
    System.out.println(info1.length() + " " + info2.length());
    System.out.println(info1 == info2);
  }
}
