package com.careerit.commonutil;

public class Validations {

      public boolean isNumber(String data){
        try {
          Double.parseDouble(data);
        }catch (Exception e){
          return false;
        }
        return true;
      }
}
