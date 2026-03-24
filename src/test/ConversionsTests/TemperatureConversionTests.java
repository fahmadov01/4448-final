package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConversionTests {
    private final ConversionStrategy converter = ConverterFactory.getConverter("Temperature");

    @Test
    void testCelsiusToFahrenheit() {
        double convertedValue = converter.convert(0, "Celsius", "Fahrenheit");
        assertEquals(32.0, convertedValue, 1e-6);
    }

    @Test
    void testFahrenheitToCensius() {
        double convertedValue = converter.convert(64, "Fahrenheit", "Celsius");
        assertEquals(17.777, convertedValue, 1e-6);
    }

    @Test
    void testKelvinToFahrenheit() {
        double convertedValue = converter.convert(400, "Kelvin", "Fahrenheit");
        assertEquals(260.33, convertedValue, 1e-6);
    }

    @Test
    void testCelsiusToKelvin() {
        double convertedValue = converter.convert(23, "Celsius", "Kelvin");
        assertEquals(296.15, convertedValue, 1e-6);
    }
}
