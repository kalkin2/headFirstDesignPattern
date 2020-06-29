package org.pattern.FactoryPattern.ex2;

import org.pattern.FactoryPattern.ex2.product.Pizza;
import org.pattern.FactoryPattern.ex2.creator.ChicagoPizzaStore;
import org.pattern.FactoryPattern.ex2.creator.NYPizzaStore;
import org.pattern.FactoryPattern.ex2.creator.PizzaStore;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("A 의 주문 "+pizza.getName()+"\n");
    Pizza cheesePizza = chicagoStore.orderPizza("cheese");
    System.out.println("B의 주문 "+pizza.getName()+"\n");

  }

}
