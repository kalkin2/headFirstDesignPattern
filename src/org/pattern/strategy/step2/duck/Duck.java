package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.fly.FlyBehavior;
import org.pattern.strategy.step2.quack.QuackBehavior;

public abstract class Duck {


    public QuackBehavior quackBehavior;
    public FlyBehavior flyBeHavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBeHavior.fly();
    }

    public void swim(){
        System.out.println("물에 뜸..");
    }

    public void display(){
        System.out.println("적당한 모영을 표시");
    }


    public void setFlyBeHavior(FlyBehavior flyBeHavior){
        this.flyBeHavior = flyBeHavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }



}
