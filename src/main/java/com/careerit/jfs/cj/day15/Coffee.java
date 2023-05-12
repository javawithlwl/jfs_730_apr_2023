package com.careerit.jfs.cj.day15;

public class Coffee {

      private String name;
      private CoffeeSize coffeeSize;
      private double price;

  public static void main(String[] args) {

      Coffee coffee = new Coffee();
      coffee.name = "Cappuccino";
      coffee.coffeeSize = CoffeeSize.L;
      coffee.price = 150;

  }
}
