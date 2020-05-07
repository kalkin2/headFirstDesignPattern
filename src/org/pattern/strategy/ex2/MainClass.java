package org.pattern.strategy.ex2;

import org.pattern.strategy.ex2.Unit.BattleCrusior;
import org.pattern.strategy.ex2.Unit.Marine;
import org.pattern.strategy.ex2.Unit.Unit;
import org.pattern.strategy.ex2.weapon.Gun;
import org.pattern.strategy.ex2.weapon.Psionic;
import org.pattern.strategy.ex2.weapon.Raisor;

public class MainClass {
    public static void main(String[] args) {


        Unit human = new Marine();
        human.setMove(new LandMove());
        human.move();
        human.attack(new Gun());
        human.setMove(new FlyMove());
        human.move();


        Unit battleCrusior = new BattleCrusior();
        battleCrusior.move();
        battleCrusior.attack(new Raisor());
        battleCrusior.setMove(new LandMove());
        battleCrusior.move();


    }
}
