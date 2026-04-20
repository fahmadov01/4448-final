package main;

import javafx.application.Platform;
import javafx.scene.control.TextField;
import main.Conversions.ConversionStrategy;

public class ConversionObserver implements Observer {
    private TextField targetField;
    private ConversionStrategy strategy;

    public ConversionObserver(TextField targetField, ConversionStrategy strategy) {
        this.targetField = targetField;
        this.strategy = strategy;
    }

    @Override
    public void update(double value, String fromUnit, String toUnit) {
        double result = strategy.convert(value, fromUnit, toUnit);
        Platform.runLater(() -> targetField.setText(String.valueOf(result)));
    }

    public void setStrategy(ConversionStrategy strategy) {
        this.strategy = strategy;
    }
}