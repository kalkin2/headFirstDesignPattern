package org.pattern.FactoryPattern.ex1;

public class DecoyDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("......");
  }

}
