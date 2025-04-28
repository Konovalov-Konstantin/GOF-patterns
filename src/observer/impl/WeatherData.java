package observer.impl;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {       // метеостанция (отслеживаемый объект)

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {      // вызывается в конструкторе создаваемого слушателя
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {     // оповещение наблюдателей об изменении состояния
        observers.forEach(observer -> observer.update());
    }

    public void measurementsChanged() {     // Оповещение наблюдателей о появлении новых данных
        notifyObservers();
    }

    //  симуляция получения данных с метеостанции
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getHumidity() {
        return humidity;
    }

    @Override
    public float getPressure() {
        return pressure;
    }
}
