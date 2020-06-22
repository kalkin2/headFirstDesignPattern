package org.pattern.decorator.ex.decorator;

import org.pattern.decorator.ex.Sayian;
import org.pattern.decorator.ex.decorator.Accesory;

public class Earing extends Accesory {

    Sayian sayian;
    public Earing(Sayian sayian) {
        System.out.println("귀걸이 장착");
        this.sayian  =sayian;
    }

    public String getDescription() {
        return sayian.getDescription()+"이어링 장착 ";
    }

    public int damage() {
        System.out.println("귀걸이 데미지 500 증가 ");
        return 500+sayian.damage();
    }
}
