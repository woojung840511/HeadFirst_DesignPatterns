package designpatterns.ch02_observer.weatherobservable;
	
import java.util.Observable;
	
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() { }
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers(); // 풀 pull 방식 : 옵저버 쪽에서 원하는 데이터를 가져가는 방식
		// notifyObservers(Object arg); // 푸쉬 방식: 옵저버들에게 메소드의 인자로 데이터를 전달해야함
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
