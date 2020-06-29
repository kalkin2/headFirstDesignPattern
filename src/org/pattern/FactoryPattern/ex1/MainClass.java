package org.pattern.FactoryPattern.ex1;

public class MainClass {

  public static void main(String[] args) {
    Duck duck = new MallardDuck();
    duck.quack();


    //구성 클래스가 여러개 일 경우는???

    String type = "picnic";
    if(type.equals("picnic")){
      duck = new MallardDuck();
    }else if(type.equals("decoy")){
      duck = new DecoyDuck();
    }else if(type.equals("rubber")){
      duck = new RubberDuck();
    }

  }

}
