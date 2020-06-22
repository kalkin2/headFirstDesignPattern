package org.pattern.decorator;

public abstract class Baverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
