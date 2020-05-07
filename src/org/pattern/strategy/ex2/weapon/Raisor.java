package org.pattern.strategy.ex2.weapon;

public class Raisor implements Weapon {
    @Override
    public void attack() {
        System.out.println("배틀크루저 광선 발사!");
    }

    @Override
    public void upgrade() {

    }
}
