package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.fly.FlyBehaviorImpl;
import org.pattern.strategy.step2.quack.QuackBehaviorImpl;

public class MallardDuck extends Duck{
    //청둥오리
    public MallardDuck() {
        quackBehavior = new QuackBehaviorImpl();
        flyBeHavior = new FlyBehaviorImpl();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        System.out.println("[[나는 청둥오리 입니다]]");
    }
}
