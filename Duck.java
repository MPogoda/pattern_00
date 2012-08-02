package ua.patterns;

public abstract class Duck {

  public abstract void display();

  public void swim() {
    System.out.println("I'm swimming!");
  }

  public void quack() {
    System.out.println("QUACK!");
  }
}
