package org.pattern.strategy.step2.quack;

public class MuteQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("소리 못내는 오리에요.......");
    }
}
