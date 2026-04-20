package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaneAngleConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Seconds of Arc", 1.0);
        map.put("Minutes of Arc", 60.0);
        map.put("Degrees", 3600.0);
        map.put("Gradians", 3240.0);
        map.put("Milliradians", 648000.0 / 1000.0);
        map.put("Radians", 648000.0 / Math.PI);
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