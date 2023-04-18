package com.careerit.jfs.cj.day1;

public class NumberOperations {

  public int biggest(int a, int b, int c) {
//          if(a > b && a > c){
//            return a;
//          }else if( b > c){
//            return b;
//          }{
//            return c;
//        }
    return (a > b && a > c) ? a : b > c ? b : c;
  }

}
