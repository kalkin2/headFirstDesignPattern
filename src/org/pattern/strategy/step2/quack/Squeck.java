package org.pattern.strategy.step2.quack;

public class Squeck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("고무오리는 삑삑 ...");
    }
}
