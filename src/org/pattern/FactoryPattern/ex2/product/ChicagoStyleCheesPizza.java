package org.pattern.FactoryPattern.ex2.product;

public class ChicagoStyleCheesPizza extends Pizza {
  public ChicagoStyleCheesPizza() {
    name = "시카고 치즈피자";
    dough = "두꺼운 크러스트";
    sauce = "플럼 토마토 ";
    toppings.add("모짜렐라 치즈 토핑 듬뿍 추가");
  }

  public void cut(){
    System.out.println("시카고는 네모나게 피자를 자름...");

  }

}
