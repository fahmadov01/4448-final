package test.ConversionsTests;

import main.Conversions.TimeConverter;
import main.Conversions.UnitConverter;
import main.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTests {
    private final UnitConverter converter = ConverterFactory.getConverter("Time");

    @Test
    void testSecondsToMinutes() {
        double convertedValue = converter.convert(120.0, "Seconds", "Minutes");
        assertEquals(2.0, convertedValue, 1e-6);
    }

    @Test
    void testMinutesToSeconds() {
        double convertedValue = converter.convert(2.0, "Minutes", "Seconds");
        assertEquals(120.0, convertedValue, 1e-6);
    }

    @Test
    void testHoursToMinutes() {
        double convertedValue = converter.convert(3.0, "Hours", "Minutes");
        assertEquals(180.0, convertedValue, 1e-6);
    }

    @Test
    void testMinutesToHours() {
        double convertedValue = converter.convert(150.0, "Minutes", "Hours");
        assertEquals(2.5, convertedValue, 1e-6);
    }
}