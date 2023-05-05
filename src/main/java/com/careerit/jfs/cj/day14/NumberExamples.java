package com.careerit.jfs.cj.day14;

public final class NumberExamples {

      private NumberExamples(){
      }
      public static int factorial(int num){
          if(num == 0 || num == 1){
              return 1;
          }
          return num * factorial(num-1);
      }
      public static int reverse(int num){
          int rev = 0;
          while(num != 0){
              int r = num % 10;
              rev = rev * 10 + r;
              num = num / 10;
          }
          return rev;
      }
      public static boolean isPalindrome(int num){
          return num == reverse(num);
      }
      public static double power(int m,int n){
          if(n == 0){
              return 1;
          }
          return m * power(m,n-1);
      }
      public static int gcd(int m,int n){
          if(n == 0){
              return m;
          }
          return gcd(n,m%n);
      }
      public static int lcm(int m,int n){
          return m * n / gcd(m,n);
      }
}
