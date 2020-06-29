package org.pattern.FactoryPattern.ex2.creator;

import org.pattern.FactoryPattern.ex2.product.NYStyleCheesePizza;
import org.pattern.FactoryPattern.ex2.product.NYStyleClamPizza;
import org.pattern.FactoryPattern.ex2.product.NYStylePeperonizza;
import org.pattern.FactoryPattern.ex2.product.NYStyleVeggiePizza;
import org.pattern.FactoryPattern.ex2.product.Pizza;

/**
 * (구상)생산자 클래스(concrete creator)
 * createPizza 메소드를 구현하여 가게 고유의 피자를 마음대로 만들수 있다.
 */
public class NYPizzaStore extends PizzaStore {

  /**
   * 팩토리 메소드
   * @param item
   * @return
   */
  @Override
  public Pizza createPizza(String item) {
    if(item.equals("cheese")){
      return new NYStyleCheesePizza();
    }else if(item.equals("veggie")){
      return new NYStyleVeggiePizza();
    }else if(item.equals("clam")){
      return new NYStyleClamPizza();
    }else if(item.equals("peperoni")){
      return new NYStylePeperonizza();
    }
    return null;
  }
}
