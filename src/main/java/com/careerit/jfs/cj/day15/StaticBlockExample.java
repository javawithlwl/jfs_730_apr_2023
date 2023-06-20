package com.careerit.jfs.cj.day15;

public class StaticBlockExample {

        static{
            System.out.println("I am static block");
        }
        public static void main(String[] args) {
            System.out.println("I am main method");
        }
        static {
            System.out.println("I am second static block");
        }
}
