package ua.patterns;

public class RedheadDuck extends Duck implements Flyable, Quakeable {
  @Override
  public void display() {
    System.out.println("I'm Redhead duck!");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }

  @Override
  public void Quack() {
    System.out.println("QUACK!");
  }
}
