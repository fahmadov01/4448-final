package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnergyTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Energy");

    @Test
    void testJoulesToKilojoules() {
        double result = converter.convert(1000, "Joules", "Kilojoules");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToGramCalories() {
        double result = converter.convert(4.184, "Joules", "Gram Calories");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToKilocalories() {
        double result = converter.convert(4184, "Joules", "Kilocalories");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToWattHours() {
        double result = converter.convert(3600, "Joules", "Watt Hours");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToKilowattHours() {
        double result = converter.convert(3_600_000, "Joules", "Kilowatt Hours");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToBritishThermalUnits() {
        double result = converter.convert(1055, "Joules", "British Thermal Units");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testJoulesToFootPounds() {
        double result = converter.convert(1.356, "Joules", "Foot-Pounds");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testKilojoulesToJoules() {
        double result = converter.convert(1, "Kilojoules", "Joules");
        assertEquals(1000.000, result, 0.001);
    }

    @Test
    void testGramCaloriesToJoules() {
        double result = converter.convert(1, "Gram Calories", "Joules");
        assertEquals(4.184, result, 0.001);
    }

    @Test
    void testKilocaloriesToJoules() {
        double result = converter.convert(1, "Kilocalories", "Joules");
        assertEquals(4184.000, result, 0.001);
    }

    @Test
    void testWattHoursToJoules() {
        double result = converter.convert(1, "Watt Hours", "Joules");
        assertEquals(3600.000, result, 0.001);
    }

    @Test
    void testKilowattHoursToJoules() {
        double result = converter.convert(1, "Kilowatt Hours", "Joules");
        assertEquals(3_600_000.000, result, 0.001);
    }

    @Test
    void testElectronvoltsToJoules() {
        double result = converter.convert(6.242e18, "Electronvolts", "Joules");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBritishThermalUnitsToJoules() {
        double result = converter.convert(1, "British Thermal Units", "Joules");
        assertEquals(1055.000, result, 0.001);
    }

    @Test
    void testFootPoundsToJoules() {
        double result = converter.convert(1, "Foot-Pounds", "Joules");
        assertEquals(1.356, result, 0.001);
    }
}