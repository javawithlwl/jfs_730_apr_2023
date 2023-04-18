package com.careerit.jfs.cj.day4;

public class GenerateNumbers {

  public static void main(String[] args) {

    int lb = 1, ub = 10;
    System.out.println(evenSum(lb,ub));
  }

  public static int evenSum(int lb, int ub) {
    int sum = 0;
    for (int i = lb; i <= ub; i++) {
        if(isEven(i)){
          sum += i;
        }
    }
    return sum;
  }
  public static boolean isEven(int num){
      return num % 2 == 0;
  }
}
