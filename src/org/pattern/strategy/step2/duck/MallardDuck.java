package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.fly.FlyImpl;
import org.pattern.strategy.step2.quack.QuackImpl;

public class MallardDuck extends Duck{
    //청둥오리
    public MallardDuck() {
        quack = new QuackImpl();
        fly = new FlyImpl();
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
