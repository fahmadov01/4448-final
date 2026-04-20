package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Seconds", 1.0);
        map.put("Minutes", 60.0);
        map.put("Hours", 3600.0);
        map.put("Days", 86400.0);
    }

    public double toBase(double value, String unit) {
        return value * map.get(unit);
    }
    public double fromBase(double value, String unit) {
        return value/map.get(unit);
    }

    public List<String> getUnits() {
        return List.of(map.keySet().toArray(new String[0]));
    }
}