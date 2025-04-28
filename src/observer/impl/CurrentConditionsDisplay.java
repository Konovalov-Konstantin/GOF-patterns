package observer.impl;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {     // наблюдатель реализует Observer

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // подписка на изменения в остлеживаемом объекте Subject
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature + " humidity: " + humidity + " pressure: " + pressure);
    }
}
