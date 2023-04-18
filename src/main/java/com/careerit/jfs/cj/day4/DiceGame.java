package com.careerit.jfs.cj.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

  public static void main(String[] args) {

    int generatedNum = ThreadLocalRandom.current().nextInt(1, 7);
    for (int i = 1; i <= 3; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Guess a number 1-6 :");
      int guessedNum = sc.nextInt();
      if (generatedNum == guessedNum) {
        System.out.println("You guessed number in " + i + " attempts");
        break;
      } else {
        if (i == 3) {
          System.out.println("You have reached max number of attempts");
          System.out.println("The generated number is :" + generatedNum);
        } else {
          System.out.println("Sorry! wrong guess, try again");
        }
      }
    }
  }
}
