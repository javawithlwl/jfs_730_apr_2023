package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class EmployeeDetails {

  public static void main(String[] args) {

      String data = "1001-Krish-60000,1002-Manoj-180000,1003-Laxmi-150000,1004-Srini-650000";
      String[] empArr = data.split(",");
      Employee[] arr = new Employee[empArr.length];
      int i=0;
      for(String ele:empArr){
            String[] empData = ele.split("-");
            int empno = Integer.parseInt(empData[0]);
            String ename = empData[1];
            double salary = Double.parseDouble(empData[2]);
            Employee emp = new Employee(empno,ename,salary);
            arr[i++] = emp;
      }

      for(Employee emp:arr){
          emp.showDetails();
      }



  }
}
