package com.careerit.jfs.cj.day11;

public class StringClassMethods {

  public static void main(String[] args) {

    String[] names = new String[]{"Krish","Manoj","Charan"};
    String message = String.join("-",names);
    System.out.println(message);
    String name = "Hello";
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name);

    for(int i=0;i<name.length();i++){
      System.out.print(name.charAt(i)+" ");
    }
    System.out.println();
    for(int i=name.length()-1;i>=0;i--){
      System.out.print(name.charAt(i)+" ");
    }
    System.out.println();
    String data = " Hello ";
    System.out.println(data.trim().length());
    System.out.println(data.length());

    String info = "INFYMANOJ";
    String brand = info.substring(4,7);
    System.out.println(brand);

    String data1 = "HI WELCOME TO JAVA WORLD";
    int len = data1.substring(2,11).toLowerCase().trim().substring(3).length();
    System.out.println(len);

  }
}
