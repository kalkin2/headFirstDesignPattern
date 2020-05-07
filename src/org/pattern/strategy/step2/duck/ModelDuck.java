package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.quack.MuteQuackBehavior;
import org.pattern.strategy.step2.fly.NoFlyBehaviorImpl;

public class ModelDuck extends Duck{


    public ModelDuck() {
        quackBehavior = new MuteQuackBehavior();
        flyBeHavior = new NoFlyBehaviorImpl();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        System.out.println("[[나는 모형 오리 입니다.]]");
    }
}
