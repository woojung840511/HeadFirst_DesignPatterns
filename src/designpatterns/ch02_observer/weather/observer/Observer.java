package designpatterns.ch02_observer.weather.observer;

public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
