package main.Conversions;

public class ConverterFactory {
    public static ConversionStrategy getConverter(String type) {
        return switch (type) {
            case "Area" -> new AreaConverter();
            case "Data Transfer Rate" -> new DataTransferRateConverter();
            case "Digital Storage" -> new DigitalStorageConverter();
            case "Energy" -> new EnergyConverter();
            case "Frequency" -> new FrequencyConverter();
            case "Fuel Economy" -> new FuelEconomyConverter();
            case "Length" -> new LengthConverter();
            case "Mass" -> new MassConverter();
            case "Plane Angle" -> new PlaneAngleConverter();
            case "Pressure" -> new PressureConverter();
            case "Speed" -> new SpeedConverter();
            case "Temperature" -> new TemperatureConverter();
            case "Time" -> new TimeConverter();
            case "Volume" -> new VolumeConverter();

            default -> throw new IllegalArgumentException("Unknown Type of Unit: " + type);
        };
    }
}