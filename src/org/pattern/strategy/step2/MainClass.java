package org.pattern.strategy.step2;


import org.pattern.strategy.step2.duck.Duck;
import org.pattern.strategy.step2.duck.MallardDuck;
import org.pattern.strategy.step2.duck.ModelDuck;
import org.pattern.strategy.step2.fly.FlyBehaviorRocketPoweredImpl;
import org.pattern.strategy.step2.fly.NoFlyBehaviorImpl;

public class MainClass {
    public static void main(String[] args) {
        //물오리
        Duck malledDuck = new MallardDuck();
        malledDuck.display();
        malledDuck.performFly();
        malledDuck.performQuack();
        malledDuck.swim();

        //모형오리
        Duck modelDuck = new ModelDuck();
        modelDuck.display();

        modelDuck.setFlyBeHavior(new FlyBehaviorRocketPoweredImpl());
        modelDuck.performFly();

        //중간에 행동을 바꿀수 있음.
        modelDuck.setFlyBeHavior(new NoFlyBehaviorImpl());
        modelDuck.performFly();

        modelDuck.performQuack();
        modelDuck.swim();;


        //상속보다는 구성을 사용한다. A is B 보다는(상속) A에는 B가 있다(구성)를 사용한다.
        //ex) 나는행동에는 fly, rocket, nofly등이 있다.

    }
}
