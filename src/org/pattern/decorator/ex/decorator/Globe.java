package org.pattern.decorator.ex.decorator;

import org.pattern.decorator.ex.Sayian;
import org.pattern.decorator.ex.decorator.Accesory;

public class Globe extends Accesory {
    Sayian sayian ;
    public Globe(Sayian sayian) {
        System.out.println("장갑 장착");
        this.sayian = sayian;
    }


    public String getDescription() {
        return sayian.getDescription()+"글러브 장착";
    }

    public int damage() {
        System.out.println("장갑 데미지200증가");
        return 200 + sayian.damage();
    }
}
