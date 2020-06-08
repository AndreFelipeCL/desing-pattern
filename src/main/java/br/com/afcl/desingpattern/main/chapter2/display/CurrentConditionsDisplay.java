package br.com.afcl.desingpattern.main.chapter2.display;

import br.com.afcl.desingpattern.main.chapter2.observer.Observer;
import br.com.afcl.desingpattern.main.chapter2.subject.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
