package org.pattern.decorator;

public class HouseBlend extends Baverage{
    public HouseBlend(){
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
