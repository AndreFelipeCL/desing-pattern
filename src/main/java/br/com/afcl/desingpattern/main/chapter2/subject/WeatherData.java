package br.com.afcl.desingpattern.main.chapter2.subject;

import br.com.afcl.desingpattern.main.chapter2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private final List<Observer> observerList;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observerList = new ArrayList<>();
	}

	@Override public void registerObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override public void removeObservable(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override public void notifyObservers() {
		observerList.forEach(observer -> observer.update(temperature, humidity, pressure));
		System.out.println();
	}

	public void setMeasurements(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}
