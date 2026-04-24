package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Temperature");

    @Test
    void testCelsiusToKelvin() {
        double convertedValue = converter.convert(25, "Celsius", "Kelvin");
        assertEquals(298.150, convertedValue, 0.001);
    }

    @Test
    void testFahrenheitToKelvin() {
        double convertedValue = converter.convert(68, "Fahrenheit", "Kelvin");
        assertEquals(293.150, convertedValue, 0.001);
    }

    @Test
    void testKelvinToCelsius() {
        double convertedValue = converter.convert(300, "Kelvin", "Celsius");
        assertEquals(26.850, convertedValue, 0.001);
    }

    @Test
    void testKelvinToFahrenheit() {
        double convertedValue = converter.convert(300, "Kelvin", "Fahrenheit");
        assertEquals(80.330, convertedValue, 0.001);
    }
}