package com.careerit.jfs.cj.day8;

public class Employee {

  private int empno;
  private String ename;
  private double salary;

  public Employee(int empno, String ename, double salary) {
    this.empno = empno;
    this.ename = ename;
    this.salary = salary;
  }
  public void showDetails(){
    System.out.println(empno+", "+ename+", "+salary);
  }

  public int getEmpno() {
    return empno;
  }

  public void setEmpno(int empno) {
    this.empno = empno;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
