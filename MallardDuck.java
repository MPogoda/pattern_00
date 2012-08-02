package ua.patterns;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior   = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm Mallard Duck!");
  }
}
