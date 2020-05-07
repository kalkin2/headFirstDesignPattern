package org.pattern.strategy.ex2.weapon;

import org.pattern.strategy.ex2.weapon.Weapon;

public class Gun implements Weapon {
    private int upgradeCnt = 1;
    @Override
    public void attack() {
        System.out.println("총 발사 ..");
    }

    @Override
    public void upgrade() {
        upgradeCnt++;
        System.out.println("강화 되었습니다.+"+upgradeCnt);
    }
}
