package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Meters", 1.0);
        map.put("Kilometers", 1000.0);
        map.put("Centimeters", 0.01);
        map.put("Inches", 0.0254);
        map.put("Feet", 0.3048);
        map.put("Yards", 0.9144);
        map.put("Miles", 1609.34);
        map.put("Nautical Miles", 1852.0);
    }

    public double toBase(double value, String unit) {
        return value * map.get(unit);
    }

    public double fromBase(double value, String unit) {
        return value / map.get(unit);
    }

    public List<String> getUnits() {
        return List.of(map.keySet().toArray(new String[0]));
    }
}