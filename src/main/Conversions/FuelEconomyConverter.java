package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuelEconomyConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Miles per gallon", 1.0);
        map.put("Miles per gallon(Imperial)", 1.201);
        map.put("Kilometers per liter", 2.352);
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