package org.pattern.strategy.ex2.weapon;

public class Psionic  implements Weapon{
    private int upgradeCnt = 1;
    @Override
    public void attack() {
        System.out.println("사이오닉 어택...");
    }

    @Override
    public void upgrade() {
        upgradeCnt++;
        System.out.println("강화 되었습니다..+"+upgradeCnt);
    }
}
