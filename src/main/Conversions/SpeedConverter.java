package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeedConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Feet per second", 1.0);
        map.put("Miles per hour", 1.467);
        map.put("Meters per second", 3.281);
        map.put("Kilometers per second", 1 / 1.097);
        map.put("Knots", 1.688);
        map.put("Kilometers per hour", 1.097);
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