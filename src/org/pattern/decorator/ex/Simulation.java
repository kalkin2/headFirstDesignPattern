package org.pattern.decorator.ex;

public class Simulation {


    public static void main(String[] args) {
        Sayian goku = new Songoku();
        goku = new Earing(goku);
        goku = new Globe(goku);

        System.out.println(goku.getDescription()+" 데미지 : "+goku.damage());
    }

}
