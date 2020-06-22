package org.pattern.observer.step2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public  WeatherData(){
        observerList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("옵저버가 등록되었습니다...");
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if(i >=0){
            observerList.remove(i);
            System.out.println("DELETE..");
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println("[날씨스테이션] 옵저버들에게 update() 사실을 알려줌...");
        for(int i =0 ;  i<observerList.size(); i++){
            Observer observer  = (Observer) observerList.get(i);
            observer.update(temperature,humidity,pressure);

        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        System.out.println("[날씨 스테이션] 측정값이 변했습니다....");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
