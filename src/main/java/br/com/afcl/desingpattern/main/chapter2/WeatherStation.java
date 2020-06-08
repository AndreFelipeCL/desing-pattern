package br.com.afcl.desingpattern.main.chapter2;

import br.com.afcl.desingpattern.main.chapter2.display.CurrentConditionsDisplay;
import br.com.afcl.desingpattern.main.chapter2.display.ForecastDisplay;
import br.com.afcl.desingpattern.main.chapter2.display.StatisticsDisplay;
import br.com.afcl.desingpattern.main.chapter2.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
