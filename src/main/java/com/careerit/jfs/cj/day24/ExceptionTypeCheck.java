package com.careerit.jfs.cj.day24;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTypeCheck {

  public static void main(String[] args) {

      Exception[] arr = new Exception[]{new RuntimeException(),new ArithmeticException(),new NullPointerException(),new IOException(),new FileNotFoundException(),new IllegalAccessException()};
      // Print only un-checked exception
      for(Exception e:arr){
          if(!(e instanceof  RuntimeException)){
            System.out.println(e);
          }
      }
  }
  public  int divide(int a,int b){
    if(b == 0){
      throw new ArithmeticException("Num2 should not be zero");
    }
    return a/b;
  }
  public void m1(){
        try{

            try{

            }catch (Exception e){

            }

            //----

            try{

            }catch (Exception e){

            }

        }catch (Exception e){
          try{

          }catch (Exception ex){

          }
        }finally{
          try{

          }catch (Exception e){

          }
        }
  }
}
