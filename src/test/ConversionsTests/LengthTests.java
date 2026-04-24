package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Length");

    @Test
    void testMetersToKilometers() {
        double convertedValue = converter.convert(1000, "Meters", "Kilometers");
        assertEquals(1.0, convertedValue, 1e-6);
    }

    @Test
    void testMetersToCentimeters() {
        double convertedValue = converter.convert(10, "Meters", "Centimeters");
        assertEquals(1000.0, convertedValue, 1e-6);
    }

    @Test
    void testMetersToInches() {
        double convertedValue = converter.convert(2, "Meters", "Inches");
        assertEquals(78.740, convertedValue, 1e-4);
    }

    @Test
    void testMetersToFeet() {
        double convertedValue = converter.convert(15, "Meters", "Feet");
        assertEquals(49.212, convertedValue, 1e-4);
    }

    @Test
    void testMetersToYards() {
        double convertedValue = converter.convert(9, "Meters", "Yards");
        assertEquals(9.842, convertedValue, 1e-5);
    }

    @Test
    void testMetersToMiles() {
        double convertedValue = converter.convert(5000, "Meters", "Miles");
        assertEquals(3.106, convertedValue, 1e-5);
    }

    @Test
    void testMetersToNauticalMiles() {
        double convertedValue = converter.convert(3704, "Meters", "Nautical Miles");
        assertEquals(2.0, convertedValue, 1e-6);
    }

    @Test
    void testKilometersToMeters() {
        double convertedValue = converter.convert(3.2, "Kilometers", "Meters");
        assertEquals(3200.0, convertedValue, 1e-6);
    }

    @Test
    void testCentimetersToMeters() {
        double convertedValue = converter.convert(250, "Centimeters", "Meters");
        assertEquals(2.5, convertedValue, 1e-6);
    }

    @Test
    void testInchesToMeters() {
        double convertedValue = converter.convert(100, "Inches", "Meters");
        assertEquals(2.54, convertedValue, 1e-6);
    }

    @Test
    void testFeetToMeters() {
        double convertedValue = converter.convert(141, "Feet", "Meters");
        assertEquals(42.976, convertedValue, 1e-4);
    }

    @Test
    void testYardsToMeters() {
        double convertedValue = converter.convert(50, "Yards", "Meters");
        assertEquals(45.72, convertedValue, 1e-6);
    }

    @Test
    void testMilesToMeters() {
        double convertedValue = converter.convert(4.2, "Miles", "Meters");
        assertEquals(6759.228, convertedValue, 1e-3);
    }

    @Test
    void testNauticalMilesToMeters() {
        double convertedValue = converter.convert(1.5, "Nautical Miles", "Meters");
        assertEquals(2778.0, convertedValue, 1e-6);
    }
}