package main.Conversions;

import java.util.List;

public interface ConversionStrategy {
    double toBase(double value, String unit);
    double fromBase(double value, String unit);
    default double convert(double value, String fromUnit, String toUnit) {
        double base = toBase(value, fromUnit);
        double convertedValue = fromBase(base, toUnit);
        double truncated = (long)(convertedValue * Math.pow(10, 3)) / Math.pow(10, 3);
        return truncated;
    }

    List<String> getUnits();
}