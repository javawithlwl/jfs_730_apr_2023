package com.careerit.jfs.cj.day18;

interface CommonQuestions{
    int reverseNumber(int num);
    int sumOfDigits(int num);
    boolean isPrime(int num);
    boolean isPalindrome(int num);
    int[] getPrimeNumbers(int lb,int ub);
    default int getCountPrimeNumbers(int lb,int ub){
        return getPrimeNumbers(lb,ub).length;
    }

}
class  MyAnswers implements CommonQuestions{

  @Override
  public int reverseNumber(int num) {
    return 0;
  }

  @Override
  public int sumOfDigits(int num) {
    return 0;
  }

  @Override
  public boolean isPrime(int num) {
    return false;
  }

  @Override
  public boolean isPalindrome(int num) {
    return false;
  }

  @Override
  public int[] getPrimeNumbers(int lb, int ub) {
    return new int[0];
  }
}
public class InterviewQuestionManager {
}
