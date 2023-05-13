package com.careerit.jfs.cj.day18;
interface IT1{
    void m1();
    void m2();
}

interface IT2{
    void m2();
}
interface  IT3{
    void m3();
}
interface IT4 extends IT1,IT2,IT3{
    void m4();
}

class CT1 implements  IT4{

      @Override
      public void m1() {

      }

      @Override
      public void m2() {

      }

      @Override
      public void m3() {

      }

      @Override
      public void m4() {

      }
}


public class InterfaceManager {
}
