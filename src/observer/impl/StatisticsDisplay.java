package observer.impl;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private Subject weatherData;
    private List<Float> statisticTemperatures;
    private double averageTemperature;
    private double maxTemperature;
    private double minTemperature;

    public StatisticsDisplay(Subject weatherData) {
        this.statisticTemperatures = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);    // подписка на изменения в остлеживаемом объекте Subject
    }

    @Override
    public void display() {
        System.out.println(String.format("Avg/Max/Min temperature: %s, %s, %s", averageTemperature, maxTemperature, minTemperature));
    }

    @Override
    public void update() {
        statisticTemperatures.add(weatherData.getTemperature());
        DoubleSummaryStatistics stat = statisticTemperatures.stream().mapToDouble(Float::doubleValue).summaryStatistics();
        averageTemperature = stat.getAverage();
        maxTemperature = stat.getMax();
        minTemperature = stat.getMin();
        display();
    }
}
