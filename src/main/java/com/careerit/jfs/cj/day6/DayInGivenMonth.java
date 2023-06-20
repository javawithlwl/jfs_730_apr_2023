package com.careerit.jfs.cj.day6;

public class DayInGivenMonth {

  public static void main(String[] args) {
    int month = 2;
    int year = 2024;
    int numDays = switch (month){
      case 1,3,5,7,8,10,12->31;
      case 4,6,9,11->30;
      case 2-> {
        if (((year % 4 == 0) &&
            !(year % 100 == 0))
            || (year % 400 == 0))
           yield  29;
        else
          yield  28;
      }
      default-> throw new IllegalArgumentException("Invalid month number");
    };
    System.out.println("Number of Days = "
        + numDays);
  }

  public void printDayNumber(String day){

      switch (day){
        case "Sunday","sun":
          System.out.println(1);
      }
  }

}
