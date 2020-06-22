package org.pattern.decorator.ex;

public class Globe extends Accesory {
    Sayian sayian ;
    public Globe(Sayian sayian) {
        this.sayian = sayian;
    }

    @Override
    public int damage() {
        return sayian.damage()+200;
    }

    @Override
    public String getDescription() {
        return sayian.getDescription()+"글러브 장착";
    }
}
