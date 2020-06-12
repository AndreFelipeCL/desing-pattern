package br.com.afcl.desingpattern.main.chapter2.display;

import br.com.afcl.desingpattern.main.chapter2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(final Observable observable) {
        this.weatherData = observable;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°F degrees and " + humidity + "% humidity.");
    }
}
