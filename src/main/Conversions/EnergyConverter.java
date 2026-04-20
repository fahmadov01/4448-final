package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnergyConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Joules", 1.0);
        map.put("Kilojoules", 1000.0);
        map.put("Gram Calories", 4.184);
        map.put("Kilocalories", 4184.0);
        map.put("Watt Hours", 3600.0);
        map.put("Kilowatt Hours", 3600000.0);
        map.put("Electronvolts", 1 / 6.242e18);
        map.put("British Thermal Units", 1055.0);
        map.put("Foot-Pounds", 1.356);
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