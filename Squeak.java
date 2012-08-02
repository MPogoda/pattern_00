package ua.patterns;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("SQUEAK!");
  }
}
