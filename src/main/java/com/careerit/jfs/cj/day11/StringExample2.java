package com.careerit.jfs.cj.day11;

public class StringExample2 {

  public static void main(String[] args) {

    String s1 = "Core";
    String s2 = "Core";
    String s3 = new String("Core");
    String s4 = new String("Core");
    System.out.println(s1 == s2);
    System.out.println(s3 == s4);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s4));
    System.out.println(s2.equals(s3));
    System.out.println(s3.equals(s2));

    System.out.println(s3.getClass()+"@"+Integer.toHexString(s3.hashCode()));
    System.out.println(s4.getClass()+"@"+Integer.toHexString(s4.hashCode()));
    System.out.println(s1.getClass()+"@"+Integer.toHexString(s1.hashCode()));
    System.out.println(s2.getClass()+"@"+Integer.toHexString(s2.hashCode()));
  }
}
