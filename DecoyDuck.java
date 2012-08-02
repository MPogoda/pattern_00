package ua.patterns;

public class DecoyDuck extends Duck {
  @Override
  public void display() {
    System.out.println("I'm decoy duck!");
  }

  @Override
  public void quack() {
    // do nothing : decoy ducks are silent
  }

  @Override
  public void fly() {
    // do nothing : decoy ducks cannot fly :<
  }
}
