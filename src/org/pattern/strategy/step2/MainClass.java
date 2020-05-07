package org.pattern.strategy.step2;


import org.pattern.strategy.step2.duck.Duck;
import org.pattern.strategy.step2.duck.MallardDuck;
import org.pattern.strategy.step2.duck.WoodDuck;

public class MainClass {
    public static void main(String[] args) {

        Duck malledDuck = new MallardDuck();
        malledDuck.performFly();
        malledDuck.performQuack();
        malledDuck.display();
        malledDuck.swim();

        Duck woodDuck = new WoodDuck();
        woodDuck.performFly();
        woodDuck.performQuack();
        woodDuck.display();
        woodDuck.swim();;


    }
}
