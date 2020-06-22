package org.pattern.decorator.ex;

import org.pattern.decorator.ex.decorator.Earing;
import org.pattern.decorator.ex.decorator.Gloves;
import org.pattern.decorator.ex.decorator.YeouiBong;

public class Simulation {

    /**
     * 손오공 장비 착용에 따른 전투력 측정
     * @param args
     */
    public static void main(String[] args) {
        Sayian goku = new Songoku();//5000
        goku = new Earing(goku);//500
        goku = new Gloves(goku);//200
        goku = new YeouiBong(goku);//800
        goku = new Earing(goku);//500
        //5000+500+200+800+500(이어링 2개 보너스 데미지 추가 55)


        System.out.println(goku.getDescription()+" 데미지 : "+goku.damage());
    }

}
