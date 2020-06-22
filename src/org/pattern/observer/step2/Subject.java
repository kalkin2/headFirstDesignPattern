package org.pattern.observer.step2;


public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);

    //주제 객체의 상태가 변경되었을때 모든 옵저버에게 알라기 위한 호출되는 메소드ㄴ
    public void notifyObserver();
}
