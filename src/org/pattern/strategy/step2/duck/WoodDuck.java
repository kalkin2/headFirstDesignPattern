package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.quack.MuteQuack;
import org.pattern.strategy.step2.fly.NoFlyImpl;

public class WoodDuck extends Duck{


    public WoodDuck() {
        quack = new MuteQuack();
        fly  = new NoFlyImpl();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        super.display();
    }
}
