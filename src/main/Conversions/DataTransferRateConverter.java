package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTransferRateConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Bits per second", 1.0);
        map.put("Kilobits per second", 1000.0);
        map.put("Kilobytes per second", 8000.0);
        map.put("Kibibits per second", 1024.0);
        map.put("Megabits per second", 1000000.0);
        map.put("Megabytes per second", 8000000.0);
        map.put("Mebibits per second", 1049000.0);
        map.put("Gigabits per second", 1000000000.0);
        map.put("Gigabytes per second", 8000000000.0);
        map.put("Gibibits per second", 1074000000.0);
        map.put("Terabits per second", 1000000000000.0);
        map.put("Terabytes per second", 8000000000000.0);
        map.put("Tebibits per second", 1100000000000.0);
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