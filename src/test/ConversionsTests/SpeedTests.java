package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpeedTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Speed");

    @Test
    void testFeetPerSecondToMilesPerHour() {
        double result = converter.convert(88.0, "Feet per second", "Miles per hour");
        assertEquals(59.986, result, 0.001);
    }

    @Test
    void testFeetPerSecondToMetersPerSecond() {
        double result = converter.convert(32.81, "Feet per second", "Meters per second");
        assertEquals(10.000, result, 0.001);
    }

    @Test
    void testFeetPerSecondToKilometersPerSecond() {
        double result = converter.convert(1097.0, "Feet per second", "Kilometers per second");
        assertEquals(0.334, result, 0.001);
    }

    @Test
    void testFeetPerSecondToKnots() {
        double result = converter.convert(50.64, "Feet per second", "Knots");
        assertEquals(30.000, result, 0.001);
    }

    @Test
    void testFeetPerSecondToKilometersPerHour() {
        double result = converter.convert(109.7, "Feet per second", "Kilometers per hour");
        assertEquals(100.000, result, 0.001);
    }

    @Test
    void testMilesPerHourToFeetPerSecond() {
        double result = converter.convert(75.0, "Miles per hour", "Feet per second");
        assertEquals(110.025, result, 0.001);
    }

    @Test
    void testMetersPerSecondToFeetPerSecond() {
        double result = converter.convert(12.5, "Meters per second", "Feet per second");
        assertEquals(41.013, result, 0.001);
    }

    @Test
    void testKilometersPerSecondToFeetPerSecond() {
        double result = converter.convert(2.0, "Kilometers per second", "Feet per second");
        assertEquals(6562.0, result, 0.001);
    }

    @Test
    void testKnotsToFeetPerSecond() {
        double result = converter.convert(40.0, "Knots", "Feet per second");
        assertEquals(67.520, result, 0.001);
    }

    @Test
    void testKilometersPerHourToFeetPerSecond() {
        double result = converter.convert(90.0, "Kilometers per hour", "Feet per second");
        assertEquals(98.730, result, 0.001);
    }

    @Test
    void testFeetPerSecondToFeetPerSecond() {
        double result = converter.convert(55.5, "Feet per second", "Feet per second");
        assertEquals(55.500, result, 0.001);
    }
}