package org.pattern.decorator.ex;

import org.pattern.decorator.ex.decorator.Earing;
import org.pattern.decorator.ex.decorator.Globe;
import org.pattern.decorator.ex.decorator.YeouiBong;

public class Simulation {

    /**
     * 손오공 장비 착용에 따른 전투력 측정
     * @param args
     */
    public static void main(String[] args) {
        Sayian goku = new Songoku();
        goku = new Earing(goku);
        goku = new Globe(goku);
        goku = new YeouiBong(goku);

       System.out.println(goku.getDescription()+" 데미지 : "+goku.damage());
    }

}
