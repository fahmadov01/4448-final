package main.Conversions;

import java.util.HashMap;
import java.util.Map;

public class LengthConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Meters", 1.0);
        map.put("Kilometers", 1000.0);
        map.put("Miles", 1609.34);
        map.put("Feet", 0.3048);
    }

    public double toBase(double value, String unit) {
        return value * map.get(unit);
    }
    public double fromBase(double value, String unit) {
        return value/map.get(unit);
    }

    public String[] getUnits() {
        return map.keySet().toArray(new String[0]);
    }
}