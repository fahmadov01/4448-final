package main;

import main.Conversions.*;

class ConverterFactory {
    public static UnitConverter getConverter(String type) {
        return switch (type) {
            case "Time" -> new TimeConverter();
            case "Length" -> new LengthConverter();
            case "Temperature" -> new TemperatureConverter();
            case "Area" -> new AreaConverter();
            default -> throw new IllegalArgumentException("Unknown Type of Unit");
        };
    }
}