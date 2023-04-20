package com.careerit.jfs.cj.day6;

import java.util.Scanner;

public class MonthName {

  public static void main(String[] args) {

    String dob = "1989-8-25"; // August 25, 1989
    String[] arr = dob.split("-");
    int month = Integer.parseInt(arr[1]);
    String monthString;
    switch (month) {
      case 1:  monthString = "January";
        break;
      case 2:  monthString = "February";
        break;
      case 3:  monthString = "March";
        break;
      case 4:  monthString = "April";
        break;
      case 5:  monthString = "May";
        break;
      case 6:  monthString = "June";
        break;
      case 7:  monthString = "July";
        break;
      case 8:  monthString = "August";
        break;
      case 9:  monthString = "September";
        break;
      case 10: monthString = "October";
        break;
      case 11: monthString = "November";
        break;
      case 12: monthString = "December";
        break;
      default: monthString = "Invalid month";
        break;
    }
    System.out.println(monthString);
    String formattedDob = monthString+" "+arr[2]+", "+arr[0];
    System.out.println(formattedDob);
  }
}
