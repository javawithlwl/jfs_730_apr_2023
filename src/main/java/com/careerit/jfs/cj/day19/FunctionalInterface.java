package com.careerit.jfs.cj.day19;


import java.util.function.BinaryOperator;
import java.util.function.Consumer;

class MathOperations{
  public int cal(int a,int b,BinaryOperator<Integer> operator){
    return operator.apply(a, b);
  }
}
public class FunctionalInterface {

  public static void main(String[] args) {

    Consumer<String> consumer = (s)-> { System.out.println(s);};

    MathOperations obj = new MathOperations();
    int res = obj.cal(10, 20, (num1, num2)->num1 + num2);
  }

}
