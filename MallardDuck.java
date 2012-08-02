package ua.patterns;

public class MallardDuck extends Duck implements Quakeable, Flyable{
  @Override
  public void display() {
    System.out.println("I'm Mallard Duck!");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }

  @Override
  public void quack() {
    System.out.println("QUACK!");
  }
}
