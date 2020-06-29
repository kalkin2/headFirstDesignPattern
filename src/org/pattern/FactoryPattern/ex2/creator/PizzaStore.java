package org.pattern.FactoryPattern.ex2.creator;


import org.pattern.FactoryPattern.ex2.product.Pizza;

/**
 * (추상)생산자 클래스 : 서브클래스에서 제품(객체)를 생산하기 위한 구현할 팩토리 메소드를 구현한다.
 */
public abstract class PizzaStore {


  /**
   * 피자 만들기 위한 일련의 작업을 나열
   * @param type
   * @return
   */
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  /**
   * 피자 생성은 하위 객체에게 위임한다.(추상 메서드) 하위 클래스에서 팩토리 메소드를 구현하게 된다. (객체생성)
   * @param type
   * @return
   */
  //팩토리 객체 대신 사용 : 서브클래스에서 구현 하도록 한다.
  protected abstract Pizza createPizza(String type);
}
