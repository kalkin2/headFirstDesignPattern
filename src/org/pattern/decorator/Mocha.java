package org.pattern.decorator;

public class Mocha  extends CondimentDecorator{
    Baverage baverage;

    public Mocha(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public String getDescription() {
        return  baverage.getDescription()+" , 모카";
    }

    @Override
    public double cost() {
        return .20 + baverage.cost();
    }
}
