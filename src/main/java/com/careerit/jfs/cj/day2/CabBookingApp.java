package com.careerit.jfs.cj.day2;

public class CabBookingApp {

  public static void main(String[] args) {
        int totalCount = 15;
        int capacity = 4;
        int totalCabsRequired = totalCount / capacity;
        if(totalCount % capacity != 0){
            totalCabsRequired = totalCabsRequired + 1;
        }
    System.out.println("With capacity of "+capacity+"  for "+totalCount+" people required "+totalCabsRequired+" cabs ");

  }
}
