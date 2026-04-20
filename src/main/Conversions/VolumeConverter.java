package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VolumeConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("US teaspoons", 1.0);
        map.put("US tablespoons", 3.0);
        map.put("US fluid ounces", 6.0);
        map.put("US legal cups", 48.692);
        map.put("US liquid pints", 192.0);
        map.put("US liquid quarts", 384.0);
        map.put("US liquid gallons", 768.0);
        map.put("Milliliters", 1 / 4.929);
        map.put("Liters", 203.0);
        map.put("Imperial teaspoons", 1.201);
        map.put("Imperial tablespoons", 3.603);
        map.put("Imperial fluid ounces", 5.765);
        map.put("Imperial cups", 57.646);
        map.put("Imperial pints", 115.0);
        map.put("Imperial quarts", 231.0);
        map.put("Imperial gallons", 992.0);
        map.put("Cubic inches", 3.325);
        map.put("Cubic feet", 5745.0);
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