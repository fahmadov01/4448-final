package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaConversionTests {
    private final ConversionStrategy converter = ConverterFactory.getConverter("Area");

    @Test
    void testSquareMetersToAcres() {
        double convertedValue = converter.convert(300, "Square Meters", "Acres");
        assertEquals(0.074, convertedValue, 1e-6);
    }

    @Test
    void testAcresToSquareMeters() {
        double convertedValue = converter.convert(2.0, "Acres", "Square Meters");
        assertEquals(8093.72, convertedValue, 1e-2);
    }

    @Test
    void testSquareFeetToSquareKilometers() {
        double convertedValue = converter.convert(1000000, "Square Feet", "Square Kilometers");
        assertEquals(0.092, convertedValue, 1e-6);
    }

    @Test
    void testSquareKilometersToSquareFeet() {
        double convertedValue = converter.convert(1, "Square Kilometers", "Square Feet");
        assertEquals(1.0763915051182415E7, convertedValue, 1);
    }
}
