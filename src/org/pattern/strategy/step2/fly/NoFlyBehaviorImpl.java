package org.pattern.strategy.step2.fly;

public class NoFlyBehaviorImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날수 없는 오리");
    }
}
