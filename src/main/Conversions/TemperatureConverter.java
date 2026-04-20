package main.Conversions;

import java.util.List;

public class TemperatureConverter implements ConversionStrategy {
    public double toBase(double value, String unit) {
        return switch (unit) {
            case "Celsius" -> value + 273.15;
            case "Fahrenheit" -> (value - 32) * 5 / 9 + 273.15;
            case "Kelvin" -> value;
            default -> throw new IllegalArgumentException("Unknown unit: " + unit);
        };
    }

    public double fromBase(double value, String unit) {
        return switch (unit) {
            case "Celsius" -> value - 273.15;
            case "Fahrenheit" -> (value - 273.15) * 9 / 5 + 32;
            case "Kelvin" -> value;
            default -> throw new IllegalArgumentException("Unknown unit: " + unit);
        };
    }

    public List<String> getUnits() {
        return List.of("Celsius", "Fahrenheit", "Kelvin");
    }
}