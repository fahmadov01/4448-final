package main.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConversionSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double value;
    private String fromUnit;
    private String toUnit;

    public void setConversion(double value, String fromUnit, String toUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        notifyObservers();
    }

    public double getValue() { return value; }
    public String getFromUnit() { return fromUnit; }
    public String getToUnit() { return toUnit; }

    @Override
    public void addObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(value, fromUnit, toUnit);
        }
    }
}