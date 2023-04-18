package com.careerit.jfs.cj.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOperationsTest {

  @Test
  void biggestAsFirstNumber() {
    NumberOperations obj = new NumberOperations();
    int actual = obj.biggest(30, 20, 10);
    int expected = 30;
    Assertions.assertEquals(expected, actual);
  }
  @Test
  void biggestAsSecondNumber() {
    NumberOperations obj = new NumberOperations();
    int actual = obj.biggest(20, 30, 10);
    int expected = 30;
    Assertions.assertEquals(expected, actual);
  }
  @Test
  void biggestAsThirdNumber() {
    NumberOperations obj = new NumberOperations();
    int actual = obj.biggest(20, 10, 30);
    int expected = 30;
    Assertions.assertEquals(expected, actual);
  }
  @Test
  void biggestAllSameValues() {
    NumberOperations obj = new NumberOperations();
    int actual = obj.biggest(30, 30, 30);
    int expected = 30;
    Assertions.assertEquals(expected, actual);
  }

}
