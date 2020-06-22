package org.pattern.decorator.ex;

public class Songoku extends Sayian {
    @Override
    public int damage() {
        System.out.println("손오공 기본 전투력 5000");
        return 5000;
    }
}
