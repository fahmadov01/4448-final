package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MassTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Mass");

    @Test
    void testGramsToOunces() {
        double result = converter.convert(28.35, "Grams", "Ounces");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testGramsToPounds() {
        double result = converter.convert(454, "Grams", "Pounds");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testGramsToKilograms() {
        double result = converter.convert(1000, "Grams", "Kilograms");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testGramsToMetricTons() {
        double result = converter.convert(1_000_000, "Grams", "Metric tons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testGramsToUSTons() {
        double result = converter.convert(907185, "Grams", "US tons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testOuncesToGrams() {
        double result = converter.convert(1, "Ounces", "Grams");
        assertEquals(28.350, result, 0.001);
    }

    @Test
    void testPoundsToGrams() {
        double result = converter.convert(1, "Pounds", "Grams");
        assertEquals(454.000, result, 0.001);
    }

    @Test
    void testKilogramsToGrams() {
        double result = converter.convert(1, "Kilograms", "Grams");
        assertEquals(1000.000, result, 0.001);
    }

    @Test
    void testMetricTonsToGrams() {
        double result = converter.convert(1, "Metric tons", "Grams");
        assertEquals(1_000_000.000, result, 0.001);
    }

    @Test
    void testUSTonsToGrams() {
        double result = converter.convert(1, "US tons", "Grams");
        assertEquals(907185.000, result, 0.001);
    }

    @Test
    void testGramsToGrams() {
        double result = converter.convert(1234.5, "Grams", "Grams");
        assertEquals(1234.500, result, 0.001);
    }
}