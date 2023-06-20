package com.careerit.jfs.cj.day14;
import static com.careerit.jfs.cj.day14.NumberExamples.*;
import static java.lang.System.out;

class A{
    void m1(){

    }
    void m2(){

    }
   void m3(){

    }
}
class B extends  A{
    void m1(){

    }
    void m2(){

    }
    void m3(){

    }
}
public class Manager {

    public static double sqrt(int num){
        out.println("sqrt method from Manager class");
        return Math.sqrt(num);
    }
    public  static final void main(final String... args) {
        double height = Double.parseDouble(args[3]);

        out.println(gcd(35,70));
        out.println(factorial(5));
        out.println(isPalindrome(13231));
        out.print(Math.sqrt(9));
    }

}
