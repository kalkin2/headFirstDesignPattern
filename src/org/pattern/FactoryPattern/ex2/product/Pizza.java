package org.pattern.FactoryPattern.ex2.product;

import java.util.ArrayList;

public abstract class Pizza {

  public String name;
  public String dough;
  public String sauce;
  public ArrayList toppings = new ArrayList();

  public void prepare() {
    System.out.printf("피자준비"+name);
    System.out.println("도우반죽..");
    System.out.println("소스추가..");
    System.out.println("토핑추가..");
    for(int i=0 ;i<toppings.size();i++){
      System.out.println("    "+toppings.get(i));
    }

  }

  public void bake() {
    System.out.println("25분동안 굽느다.");
  }

  public void cut() {
    System.out.println("자른다...");
  }

  public void box() {
    System.out.println("박스에 포장...");
  }

  public String getName(){
    return name;
  }
}
