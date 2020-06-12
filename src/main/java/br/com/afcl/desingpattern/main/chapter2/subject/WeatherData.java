package br.com.afcl.desingpattern.main.chapter2.subject;

import lombok.Getter;

import java.util.Observable;

public class WeatherData extends Observable {

    @Getter private float temperature;
    @Getter private float humidity;
    @Getter private float pressure;

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
