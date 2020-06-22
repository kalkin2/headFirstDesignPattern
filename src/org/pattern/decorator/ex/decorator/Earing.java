package org.pattern.decorator.ex.decorator;

import org.pattern.decorator.ex.Sayian;
import org.pattern.decorator.ex.decorator.Accesory;

public class Earing extends Accesory {

    static protected int EARING_CNT = 0;
    static protected int BASIC_DAMAGE = 500;
    static protected int BONUS_DAMAGE = 55;
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
       // return 500+sayian.damage()+addDamage();
        return sayian.damage()+addDamage();
    }

    private int addDamage() {
        EARING_CNT += 1;
        int addDemage = 500;


        //두개를 다 찼을 경우 보너스 데미지 555  추가
        if(EARING_CNT >= 2){
            addDemage = BASIC_DAMAGE + BONUS_DAMAGE;
        }

        return addDemage;
    }
}
