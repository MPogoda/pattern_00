package ua.patterns;

public class RubberDuck extends Duck {
  public RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior   = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I'm rubber duck!");
  }
}
