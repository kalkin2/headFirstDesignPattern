package org.pattern.decorator.ex.decorator;

import org.pattern.decorator.ex.Sayian;
import org.pattern.decorator.ex.decorator.Accesory;

public  class YeouiBong extends Weapon {

    Sayian sayian;

    public YeouiBong(Sayian sayian) {
        this.sayian = sayian;
    }

    @Override
    public String getDescription() {
        return sayian.getDescription()+"여의봉 추가";
    }

    @Override
    public int damage() {
        System.out.println("여의봉 데미지 800 증가 ");
        return 800+sayian.damage();
    }
}
