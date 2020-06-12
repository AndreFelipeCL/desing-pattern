package br.com.afcl.desingpattern.main.chapter2.display;

import br.com.afcl.desingpattern.main.chapter2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private static int numReadings = 0;
    private float maxTemp = 0.0f;
    private float minTemp = 200f;
    private float tempSum = 0.0f;
    private Observable weatherData;

    public StatisticsDisplay(Observable observable) {
        this.weatherData = observable;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;

            if (temperature > maxTemp) {
                maxTemp = temperature;
            }

            if (temperature < minTemp) {
                minTemp = temperature;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp + " | Views: " + numReadings);
    }
}