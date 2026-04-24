package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PressureTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Pressure");

    @Test
    void testAtmospheresToBars() {
        double result = converter.convert(2.5, "Atmospheres", "Bars");
        assertEquals(2.533, result, 0.001);
    }

    @Test
    void testAtmospheresToPascals() {
        double result = converter.convert(1.2, "Atmospheres", "Pascals");
        assertEquals(121590.000, result, 1.0);
    }

    @Test
    void testAtmospheresToPSI() {
        double result = converter.convert(3.3, "Atmospheres", "Pound-forces per square inch");
        assertEquals(48.497, result, 0.001);
    }

    @Test
    void testAtmospheresToTorrs() {
        double result = converter.convert(0.75, "Atmospheres", "Torrs");
        assertEquals(570.000, result, 0.001);
    }

    @Test
    void testBarsToAtmospheres() {
        double result = converter.convert(5.0, "Bars", "Atmospheres");
        assertEquals(4.935, result, 0.001);
    }

    @Test
    void testPascalsToAtmospheres() {
        double result = converter.convert(202650, "Pascals", "Atmospheres");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testPSIToAtmospheres() {
        double result = converter.convert(29.392, "Pound-forces per square inch", "Atmospheres");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testTorrsToAtmospheres() {
        double result = converter.convert(380, "Torrs", "Atmospheres");
        assertEquals(0.500, result, 0.001);
    }

    @Test
    void testAtmospheresToAtmospheres() {
        double result = converter.convert(7.25, "Atmospheres", "Atmospheres");
        assertEquals(7.250, result, 0.001);
    }
}