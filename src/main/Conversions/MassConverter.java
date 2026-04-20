package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MassConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Grams", 1.0);
        map.put("Ounces", 28.35);
        map.put("Pounds", 454.0);
        map.put("Kilograms", 1000.0);
        map.put("Metric tons", 1000000.0);
        map.put("US tons", 907185.0);
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