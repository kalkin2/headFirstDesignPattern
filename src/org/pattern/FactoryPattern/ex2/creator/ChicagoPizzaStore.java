package org.pattern.FactoryPattern.ex2.creator;

import org.pattern.FactoryPattern.ex2.product.ChicagoStyleCheesPizza;
import org.pattern.FactoryPattern.ex2.product.ChicagoStyleClamPizza;
import org.pattern.FactoryPattern.ex2.product.ChicagoStylePeperoniPizza;
import org.pattern.FactoryPattern.ex2.product.ChicagoStyleVeggieizza;
import org.pattern.FactoryPattern.ex2.product.Pizza;

/**
 * (구상)생산자 클래스(concrete creator)
 * createPizza 메소드를 구현하여 가게 고유의 피자를 마음대로 만들수 있다.
 */
public class ChicagoPizzaStore extends PizzaStore {

  /**
   * 팩토리 메소드
   * @param item
   * @return
   */
  public Pizza createPizza(String item) {
    if(item.equals("cheese")){
      return new ChicagoStyleCheesPizza();
    }else if(item.equals("veggie")){
      return new ChicagoStyleVeggieizza();
    }else if(item.equals("clam")){
      return new ChicagoStyleClamPizza();
    }else if(item.equals("peperoni")){
      return new ChicagoStylePeperoniPizza();
    }
    return null;
  }
}
