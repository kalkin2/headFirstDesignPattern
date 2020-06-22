package org.pattern.observer.step2;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        System.out.println("CurrentConditionDisplay 의 생성자 호출됨");
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("[옵저버]update");
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    @Override
    public void display() {
        System.out.println("[옵저버]display()호출됨..");
        System.out.println("[옵저버]현재 온도는  "+temperature+" 습도는  : "+humidity+" 입니다. ");
    }
}
