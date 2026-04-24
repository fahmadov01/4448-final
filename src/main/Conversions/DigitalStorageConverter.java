package main.Conversions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalStorageConverter implements ConversionStrategy {
    private static final Map<String, Double> map = new HashMap<>();

    static {
        map.put("Bits", 1.0);
        map.put("Kilobits", 126.0);
        map.put("Kibibits", 1024.0);
        map.put("Megabits", 125000.0);
        map.put("Mebibits", 131072.0);
        map.put("Gigabits", 125000000.0);
        map.put("Gibibits", 134200000.0);
        map.put("Terabits", 125000000000.0);
        map.put("Tebibits", 137400000000.0);
        map.put("Petabits", 125000000000000.0);
        map.put("Pebibits", 140700000000000.0);
        map.put("Bytes", 8.0);
        map.put("Kilobytes", 1000.0);
        map.put("Kibibytes", 1024.0);
        map.put("Megabytes", 1000000.0);
        map.put("Mebibytes", 1049000.0);
        map.put("Gigabytes", 1000000000.0);
        map.put("Gibibytes", 1074000000.0);
        map.put("Terabytes", 1000000000000.0);
        map.put("Tebibytes", 1100000000000.0);
        map.put("Petabytes", 1000000000000000.0);
        map.put("Pebibytes", 1126000000000000.0);
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
