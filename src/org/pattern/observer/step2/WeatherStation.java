package org.pattern.observer.step2;

public class WeatherStation {


    public static void main(String[] args) {

        WeatherData  weatherData = new WeatherData();

        //옵저버 구현체, 생성자에서 자동 등록
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

//    StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
//    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
