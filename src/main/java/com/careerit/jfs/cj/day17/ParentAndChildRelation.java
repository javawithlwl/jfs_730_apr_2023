package com.careerit.jfs.cj.day17;

import java.util.concurrent.ThreadLocalRandom;

class P{

    public void m1(){
        System.out.println("P class m1 method");
    }
    public void m2(){
        System.out.println("P class m2 method");
    }
}
class  C extends  P{
    public void m1(){
        System.out.println("C class m1 method");
    }
    public void m3(){
        System.out.println("C class m3 method");
    }
}
class  D extends  P{
    public void m1(){
        System.out.println("D class m1 method");
    }
    public void m3(){
        System.out.println("D class m3 method");
    }
}
class  E extends  P{
    public void m1(){
        System.out.println("E class m1 method");
    }
    public void m3(){
        System.out.println("E class m3 method");
    }
    public void m4(){
        System.out.println("E class m4 method");
    }
}
public class ParentAndChildRelation {

  public static void main(String[] args) {

      P obj = getInstance();
      if(obj instanceof E eobj){
          eobj.m1();
          eobj.m2();
          eobj.m3();
          eobj.m4();
      }else if(obj instanceof D dobj) {
          dobj.m1();
          dobj.m2();
          dobj.m3();
      }else if(obj instanceof C cobj){
          cobj.m1();
          cobj.m2();
          cobj.m3();
      }else{
          obj.m1();
          obj.m2();
      }

  }

    public static P getInstance(){
        int num = ThreadLocalRandom.current().nextInt(1,4);
        if(num == 1){
            return new C();
        }else if(num == 2) {
            return new D();
        }else{
            return new E();
        }


    }



}
