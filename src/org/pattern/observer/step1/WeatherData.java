package org.pattern.observer.step1;

/**
 * 옵저버 패턴
 * 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고
 * 자동으로 내용이 갱신되는 방식으로 일대다의 의존성을 정의한다.
 * ex)신문사와-정기구독자, 날씨스테이션-디스플레이 , 헤드헌터- 취업준비생
 */
public class WeatherData {

    public void mearsurementsChanged(){

        //이미 구현되어 있는 WEATHERDATA의 게터 메소드를 써서 최신 측정값을 가져옵니다.
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();


        //구체적인 구현에 맞춰서 코딩했기 때문에 프로그램을 고치치 않고는 다른 디스플레이 항목을 추가/제거 할 수 없다.
//        //바뀔수 있는 부분 , 캡슐화 해야한다, temp, humidity, pressure..
//        currentConditionsDisplay.update(temp,humidity,pressure);
//        staticsDisplay.update(temp,humidity,pressure);
//        forecastDisplay.update(temp,humidity,pressure);
    }

    private float getPressure() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
