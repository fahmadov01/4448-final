package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Area");

    @Test
    void testSquareMetersToSquareKilometers() {
        double result = converter.convert(1_000_000, "Square Meters", "Square Kilometers");
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    void testSquareMetersToSquareFeet() {
        double result = converter.convert(1, "Square Meters", "Square Feet");
        assertEquals(10.763, result, 1e-4);
    }

    @Test
    void testSquareMetersToSquareInches() {
        double result = converter.convert(1, "Square Meters", "Square Inches");
        assertEquals(1550.0031, result, 1e-3);
    }

    @Test
    void testSquareMetersToSquareYards() {
        double result = converter.convert(1, "Square Meters", "Square Yards");
        assertEquals(1.195, result, 1e-5);
    }

    @Test
    void testSquareMetersToSquareMiles() {
        double result = converter.convert(2_589_988.110336, "Square Meters", "Square Miles");
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    void testSquareMetersToAcres() {
        double result = converter.convert(4046.86, "Square Meters", "Acres");
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    void testSquareMetersToHectares() {
        double result = converter.convert(10_000, "Square Meters", "Hectares");
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    void testSquareKilometersToSquareMeters() {
        double result = converter.convert(1, "Square Kilometers", "Square Meters");
        assertEquals(1_000_000.0, result, 1e-6);
    }

    @Test
    void testSquareFeetToSquareMeters() {
        double result = converter.convert(1, "Square Feet", "Square Meters");
        assertEquals(0.092, result, 1e-6);
    }

    @Test
    void testSquareInchesToSquareMeters() {
        double result = converter.convert(3022523, "Square Inches", "Square Meters");
        assertEquals(1950.01, result, 1e-10);
    }

    @Test
    void testSquareYardsToSquareMeters() {
        double result = converter.convert(1, "Square Yards", "Square Meters");
        assertEquals(0.836, result, 1e-6);
    }

    @Test
    void testSquareMilesToSquareMeters() {
        double result = converter.convert(1, "Square Miles", "Square Meters");
        assertEquals(2_589_988.110336, result, 1e-3);
    }

    @Test
    void testAcresToSquareMeters() {
        double result = converter.convert(1, "Acres", "Square Meters");
        assertEquals(4046.86, result, 1e-2);
    }

    @Test
    void testHectaresToSquareMeters() {
        double result = converter.convert(1, "Hectares", "Square Meters");
        assertEquals(10_000.0, result, 1e-6);
    }
}