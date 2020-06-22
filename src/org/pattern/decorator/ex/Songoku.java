package org.pattern.decorator.ex;

public class Songoku extends Sayian {

    public Songoku() {
        System.out.println("손오공 클래스 생성됨 ");
        description = "손오공";
    }

    @Override
    public int damage() {
        System.out.println("손오공의 기본공격력 5000");
        return 5000;
    }
}
