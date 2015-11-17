package com.shilu.designPattern.l02.observer;
import java.util.ArrayList;
/**
 * Created by shilu on 15-10-29.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(ArrayList observers) {
        this.observers =new ArrayList();
    }
    @Override public void registerObserver(Observer o) {
        observers.add(o);

    }
    @Override public void removeObserver(Observer o) {
        observers.remove(o);

    }
    @Override public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
