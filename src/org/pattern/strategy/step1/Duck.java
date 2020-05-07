package org.pattern.strategy.step1;

public class Duck {

    public void quack(){
        System.out.println("꽥꽥");
    }

    public void swim(){
        System.out.println("수영중..");
    }

    public void display(){
        System.out.println("적당한 모영을 표시");
    }

    //추가
    public void fly(){
        System.out.println("오리 날다");
    }
}
