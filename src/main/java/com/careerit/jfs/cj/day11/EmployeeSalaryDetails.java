package com.careerit.jfs.cj.day11;

import java.util.Scanner;

public class EmployeeSalaryDetails {

  public static void main(String[] args) {

    Scanner sc = new Scanner(EmployeeSalaryDetails.class.getResourceAsStream("/employee.txt"));
    boolean isHeading=true;
    while (sc.hasNextLine()) {
      String data = sc.nextLine();
      if(isHeading){
        isHeading=false;
        continue;
      }
      String[] arr = data.split(",");
      double salary = Double.parseDouble(arr[2]);
      double comm =  Double.parseDouble(arr[3]);
      double totalSalary = salary + comm;
      double bonus = 500;
      if(comm <= 500){
          bonus = comm * 2;
      }else if(comm > 500){
          bonus = comm + comm * .5;
      }
      System.out.println(data);
      data+=","+totalSalary+","+bonus;
      System.out.println(data);
      System.out.println("-------------------------------------");

    }
  }
}
