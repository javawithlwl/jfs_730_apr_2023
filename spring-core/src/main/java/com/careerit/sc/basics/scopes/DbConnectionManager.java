package com.careerit.sc.basics.scopes;

public class DbConnectionManager {

  public static void main(String[] args) {

    DbConnection obj1 = DbConnection.getInstance();
    DbConnection obj2 = DbConnection.getInstance();
    DbConnection obj3 = DbConnection.getInstance();

    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);


  }
}
