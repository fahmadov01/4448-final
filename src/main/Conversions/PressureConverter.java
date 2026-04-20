package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PressureConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Atmospheres", 1.0);
        map.put("Bars", 1 / 1.013);
        map.put("Pascals", 1 / 101325.0);
        map.put("Pound-forces per square inch", 1 / 14.696);
        map.put("Torrs", 1 / 760.0);
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