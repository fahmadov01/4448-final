package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthConversionTests {
    private final ConversionStrategy converter = ConverterFactory.getConverter("Length");

    @Test
    void testKilometersToMiles() {
        double convertedValue = converter.convert(300, "Kilometers", "Miles");
        assertEquals(186.411, convertedValue, 1e-6);
    }

    @Test
    void testMilesToKilometers() {
        double convertedValue = converter.convert(2.0, "Miles", "Kilometers");
        assertEquals(3.218, convertedValue, 1e-2);
    }

    @Test
    void testFeetToMeters() {
        double convertedValue = converter.convert(141, "Feet", "Meters");
        assertEquals(42.976, convertedValue, 1e-6);
    }

    @Test
    void testMetersToFeet() {
        double convertedValue = converter.convert(1, "Meters", "Feet");
        assertEquals(3.280, convertedValue, 1);
    }
}