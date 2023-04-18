package com.careerit.jfs.cj.day1;


import java.util.StringJoiner;

public class Employee {

    private int empno;
    private String name;
    private float salary;

  public int getEmpno() {
    return empno;
  }

  public void setEmpno(int empno) {
    this.empno = empno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
        .add("empno=" + empno)
        .add("name='" + name + "'")
        .add("salary=" + salary)
        .toString();
  }
}
