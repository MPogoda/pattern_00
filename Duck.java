package ua.patterns;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void swim() {
    System.out.println("I'm swimming!");
  }

  final public void fly() {
    flyBehavior.fly();
  }

  final public void quack() {
    quackBehavior.quack();
  }
}
