package org.pattern.decorator.ex;

public abstract class Sayian {
    String description ="사이어인";

    public String getDescription() {
        return description;
    }


    public abstract int damage();


}
