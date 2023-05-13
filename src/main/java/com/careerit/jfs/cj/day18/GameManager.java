package com.careerit.jfs.cj.day18;

interface  Game {
  void start();
  void play();
  void stop();
}
abstract class AbstractGame implements  Game{
  @Override
  public void start() {
    System.out.println("You are starting " + this.getClass().getSimpleName() + " game....");
  }
  @Override
  public void stop() {
    System.out.println("You are stopping " + this.getClass().getSimpleName() + " game....");
  }

}
class Car extends AbstractGame implements Game {

  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + " game, please wear seat belt....");
  }


}

class Bike extends AbstractGame implements Game {

  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + " game, please wear helmet....");
  }
}

class Ship extends AbstractGame implements Game {

  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + " game, please wear life jacket....");
  }
}

public class GameManager {

  public static void main(String[] args) {

    Game[] arr = new Game[]{new Car(), new Bike(), new Ship(), new Car(), new Bike(), new Ship(), new Car()
        , new Bike(), new Ship(), new Car(), new Bike(), new Ship(), new Car(), new Bike(), new Ship(), new Car()};

    for (Game game : arr) {
      game.start();
      game.play();
      game.stop();
      System.out.println("-".repeat(100));
    }

  }
}
