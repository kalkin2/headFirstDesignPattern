package org.pattern.decorator.ex;

public class Earing extends Accesory{

    Sayian sayian;
    public Earing(Sayian sayian) {
        this.sayian  =sayian;
    }

    @Override
    public String getDescription() {
        return sayian.getDescription()+"이어링 장착";
    }

    @Override
    public int damage() {
        System.out.println("데미지 증가 ");
        return sayian.damage()+ 500;
    }
}
