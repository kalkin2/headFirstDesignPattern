package org.pattern.strategy.step2.fly;

public class FlyBehaviorRocketPoweredImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아 갑니다.");
    }
}
