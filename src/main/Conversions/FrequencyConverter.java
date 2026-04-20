package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Hertz", 1.0);
        map.put("Kilohertz", 1000.0);
        map.put("Megahertz", 1000000.0);
        map.put("Gigahertz", 1000000000.0);
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