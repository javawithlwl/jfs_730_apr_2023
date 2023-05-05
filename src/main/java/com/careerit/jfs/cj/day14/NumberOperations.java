package com.careerit.jfs.cj.day14;

import java.util.Arrays;

final class One{
    int a = 10;
    public  void show(){
        System.out.println("One");
    }
}
class Two{

}
public class NumberOperations {

  public static void main(final String[] args) {

        One obj = new One();
        obj.a = 100;

        String name = "Hello";
        System.out.println(name.concat(" World"));
        System.out.println(name);

  }


}
