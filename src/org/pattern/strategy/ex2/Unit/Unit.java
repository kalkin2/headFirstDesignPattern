package org.pattern.strategy.ex2.Unit;

import org.pattern.strategy.ex2.LandMove;
import org.pattern.strategy.ex2.Moveable;
import org.pattern.strategy.ex2.weapon.Weapon;

public interface Unit {


    //이동
    void move();

    //공격
    void attack(Weapon weapon);

    void setMove(Moveable landMove);
}
