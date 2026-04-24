package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Frequency");

    @Test
    void testHertzToKilohertz() {
        double result = converter.convert(1000, "Hertz", "Kilohertz");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testHertzToMegahertz() {
        double result = converter.convert(1_000_000, "Hertz", "Megahertz");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testHertzToGigahertz() {
        double result = converter.convert(1_000_000_000, "Hertz", "Gigahertz");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testKilohertzToHertz() {
        double result = converter.convert(1, "Kilohertz", "Hertz");
        assertEquals(1000.000, result, 0.001);
    }

    @Test
    void testMegahertzToHertz() {
        double result = converter.convert(1, "Megahertz", "Hertz");
        assertEquals(1_000_000.000, result, 0.001);
    }

    @Test
    void testGigahertzToHertz() {
        double result = converter.convert(1, "Gigahertz", "Hertz");
        assertEquals(1_000_000_000.000, result, 0.001);
    }

    @Test
    void testHertzToHertz() {
        double result = converter.convert(1234, "Hertz", "Hertz");
        assertEquals(1234.000, result, 0.001);
    }
}