package observer;

import observer.impl.CurrentConditionsDisplay;
import observer.impl.StatisticsDisplay;
import observer.impl.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();    // метеостанция (отслеживаемый объект)

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);    // первый подписчик. В конструкторе сразу выполняется подписка на weatherData
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);               // второй подписчик

        weatherData.setMeasurements(80, 65, 30.4f);        //  симуляция получения данных с метеостанции
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
