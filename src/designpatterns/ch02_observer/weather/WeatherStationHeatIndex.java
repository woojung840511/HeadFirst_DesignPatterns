package designpatterns.ch02_observer.weather;

import designpatterns.ch02_observer.weather.observer.CurrentConditionsDisplay;
import designpatterns.ch02_observer.weather.observer.ForecastDisplay;
import designpatterns.ch02_observer.weather.observer.HeatIndexDisplay;
import designpatterns.ch02_observer.weather.observer.StatisticsDisplay;
import designpatterns.ch02_observer.weather.subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
