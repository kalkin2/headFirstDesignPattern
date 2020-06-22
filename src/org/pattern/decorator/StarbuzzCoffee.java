package org.pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
//        Baverage baverage = new Espresso();
//        System.out.println(baverage.getDescription()+": $"+baverage.cost());

        Baverage baverage1 = new Espresso();
        baverage1 = new Mocha(baverage1);
        baverage1 = new Mocha(baverage1);
        System.out.println(baverage1.getDescription()+": $"+baverage1.cost());
    }
}
