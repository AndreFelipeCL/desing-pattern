package br.com.afcl.desingpattern.main.chapter2.display;

import br.com.afcl.desingpattern.main.chapter2.observer.Observer;
import br.com.afcl.desingpattern.main.chapter2.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private static int numReadings = 0;
	private float maxTemp = 0.0f;
	private float minTemp = 200f;
	private float tempSum = 0.0f;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp + " | Views: " + numReadings);
	}
}