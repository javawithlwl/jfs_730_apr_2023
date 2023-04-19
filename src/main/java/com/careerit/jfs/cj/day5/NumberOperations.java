package com.careerit.jfs.cj.day5;

public class NumberOperations {

  public static void main(String[] args) {
    int num = 23679;
    int sum = sumOfDigits(num);
    int rev = reverse(num);
    System.out.println("Sum of digits of " + num + " is " + sum);
    System.out.println("Reverse of " + num + " is " + rev);
    System.out.println(num + " is palindrome : " + isPalindrome(num));
    System.out.println(num+" is armstrong : "+isArmstrong(num));
    System.out.println(num+" single digit sum is : "+sumOfDigitsUntilSingleDigitSum(num));
  }

  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num != 0) {
      int r = num % 10;
      sum += r;
      num /= 10;
    }
    return sum;
  }

  public static boolean isArmstrong(int num) {
    int tmp = num;
    int sum = 0;
    while (tmp != 0) {
      int r = tmp % 10;
      sum = sum + (r * r * r);
      tmp /= 10;
    }
    return num == sum;
  }

  public static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num /= 10;
    }
    return rev;
  }
  public static int sumOfDigitsUntilSingleDigitSum(int num){
        while (num > 9){
          int sum = num / 10 + num % 10;
          num = sum;
        }
        return num;
  }

  public static boolean isPalindrome(int num) {
    return num == reverse(num);
  }
}
