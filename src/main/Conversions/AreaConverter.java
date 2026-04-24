package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreaConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Square Meters", 1.0);
        map.put("Square Kilometers", 1_000_000.0);
        map.put("Square Feet", 0.092903);
        map.put("Square Inches", 0.00064516);
        map.put("Square Yards", 0.836127);
        map.put("Square Miles", 2_589_988.110336);
        map.put("Acres", 4046.86);
        map.put("Hectares", 10000.0);
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