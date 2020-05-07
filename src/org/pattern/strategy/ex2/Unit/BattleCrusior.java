package org.pattern.strategy.ex2.Unit;

import org.pattern.strategy.ex2.FlyMove;
import org.pattern.strategy.ex2.LandMove;
import org.pattern.strategy.ex2.Moveable;
import org.pattern.strategy.ex2.weapon.Weapon;

public class BattleCrusior implements Unit {

    private Moveable moveable;
    public BattleCrusior(){
        System.out.println("배틀크루저 생성");
    }
    @Override
    public void move() {
        if(moveable==null){
            moveable = new FlyMove();
        }
        moveable.move();
    }

    @Override
    public void attack(Weapon weapon) {
        System.out.println("레이져 광선 출력");
    }

    @Override
    public void setMove(Moveable moveable) {
        this.moveable = moveable;
    }
}
