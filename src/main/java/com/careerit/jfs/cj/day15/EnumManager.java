package com.careerit.jfs.cj.day15;

public class EnumManager {

  public static void main(String[] args) {

            Day day = Day.TUESDAY;

            switch (day){
                case SUNDAY:
                    System.out.println("Today is holiday");
                    break;
                case MONDAY:
                    System.out.println("Mondays are bad");
                    break;
                case TUESDAY:
                    System.out.println("Tuesdays is ok");
                    break;
                case WEDNESDAY:
                    System.out.println("Today is working day");
                    break;
                case THURSDAY:
                    System.out.println("Today is working day");
                    break;
                case FRIDAY:
                    System.out.println("Fridays are good");
                    break;
                case SATURDAY:
                    System.out.println("Today is working day");
                    break;
            }
  }
}
