package ua.patterns;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I'm flying using my wings!");
  }
}
