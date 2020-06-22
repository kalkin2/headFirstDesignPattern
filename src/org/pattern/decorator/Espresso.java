package org.pattern.decorator;

public class Espresso extends Baverage{
    public Espresso(){
        description = "에스프레소";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
}
