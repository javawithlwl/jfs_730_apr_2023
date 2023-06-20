package com.careerit.jfs.cj.day18;

public interface IGame {
        void start();
        void play();
        void stop();
}

class CarGame implements IGame{

       @Override
       public void start(){
           System.out.println("Car game started");
       }
        @Override
        public void play() {
          System.out.println("Car game playing");
        }
        @Override
        public void stop() {
          System.out.println("Car game stopped");
        }

}
class BikeGame implements IGame{

       @Override
       public void start(){
           System.out.println("Bike game started");
       }
        @Override
        public void play() {
          System.out.println("Bike game playing");
        }
        @Override
        public void stop() {
          System.out.println("Bike game stopped");
        }

}
