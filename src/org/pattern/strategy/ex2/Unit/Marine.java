package org.pattern.strategy.ex2.Unit;

import org.pattern.strategy.ex2.LandMove;
import org.pattern.strategy.ex2.Moveable;
import org.pattern.strategy.ex2.weapon.Weapon;

public class Marine implements Unit {

    private Moveable moveable;
    public Marine(){
        System.out.println("마린 생성");
    }


    @Override
    public void move() {
        moveable.move();
    }

    @Override
    public void attack(Weapon weapon) {
            weapon.attack();
    }

    @Override
    public void setMove(Moveable moveable) {
        this.moveable = moveable;
    }


}
