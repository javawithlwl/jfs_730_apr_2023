package com.careerit.jfs.cj.day24;

import java.io.IOException;

class One{

      void m1()throws Exception{
        System.out.println("One m1");
      }
}
class Two extends One{
      @Override
      void m1(){
        System.out.println("Two m1");
      }

}
public class ExceptionsWithOverride {
}
