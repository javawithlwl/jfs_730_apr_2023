package com.careerit.jfs.cj.day18;

import java.util.ArrayList;
import java.util.List;

abstract class MathOperations {
  public List<Integer> getPrimes(int lb, int ub) {
    List<Integer> primeList = new ArrayList<>();
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        primeList.add(i);
      }
    }
    return primeList;
  }

  public int count(int lb, int ub) {
    return getPrimes(lb, ub).size();
  }

  protected abstract boolean isPrime(int num);
}

class MyMathOperations extends MathOperations {

  @Override
  public boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}


public class Manager {

  public static void main(String[] args) {

    MathOperations obj = new MyMathOperations();
    System.out.println(obj.isPrime(45));
  }
}
