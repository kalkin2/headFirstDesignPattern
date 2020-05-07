package org.pattern.strategy.step2.duck;

import org.pattern.strategy.step2.fly.Fly;
import org.pattern.strategy.step2.quack.Quack;

public class Duck {


    public Quack quack;
    public Fly fly;

    public void performQuack(){
        quack.quack();
    }

    public void performFly(){
        fly.fly();
    }

    public void swim(){
        System.out.println("수영중..");
    }

    public void display(){
        System.out.println("적당한 모영을 표시");
    }
}
