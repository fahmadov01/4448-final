package main.Conversions;

import java.util.HashMap;
import java.util.Map;

public class TemperatureConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    public double toBase(double value, String unit) {
        return switch (unit) {
            case "Celsius" -> value + 273.15;
            case "Fahrenheit" -> (value - 32) * 5 / 9 + 273.15;
            case "Kelvin" -> value;
            default -> throw new IllegalArgumentException();
        };
    }

    public double fromBase(double value, String unit) {
        return switch (unit) {
            case "Celsius" -> value - 273.15;
            case "Fahrenheit" -> (value - 273.15) * 9 / 5 + 32;
            case "Kelvin" -> value;
            default -> throw new IllegalArgumentException();
        };
    }

    public String[] getUnits() {
        return new String[]{"Celsius", "Fahrenheit", "Kelvin"};
    }
}