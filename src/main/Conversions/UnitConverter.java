package main.Conversions;

public interface UnitConverter {
    double toBase(double value, String unit);
    double fromBase(double value, String unit);
    double convert(double value, String firstUnit, String secondUnit);
    String[] getUnits();
}