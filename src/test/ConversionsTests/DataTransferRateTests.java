package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTransferRateTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Data Transfer Rate");

    @Test
    void testBitsPerSecondToKilobitsPerSecond() {
        double result = converter.convert(1000, "Bits per second", "Kilobits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToKilobytesPerSecond() {
        double result = converter.convert(8000, "Bits per second", "Kilobytes per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToKibibitsPerSecond() {
        double result = converter.convert(1024, "Bits per second", "Kibibits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToMegabitsPerSecond() {
        double result = converter.convert(1_000_000, "Bits per second", "Megabits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToMegabytesPerSecond() {
        double result = converter.convert(8_000_000, "Bits per second", "Megabytes per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToMebibitsPerSecond() {
        double result = converter.convert(1_049_000, "Bits per second", "Mebibits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToGigabitsPerSecond() {
        double result = converter.convert(1_000_000_000, "Bits per second", "Gigabits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToGigabytesPerSecond() {
        double result = converter.convert(8_000_000_000L, "Bits per second", "Gigabytes per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToGibibitsPerSecond() {
        double result = converter.convert(1_074_000_000, "Bits per second", "Gibibits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToTerabitsPerSecond() {
        double result = converter.convert(1_000_000_000_000L, "Bits per second", "Terabits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToTerabytesPerSecond() {
        double result = converter.convert(8_000_000_000_000L, "Bits per second", "Terabytes per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsPerSecondToTebibitsPerSecond() {
        double result = converter.convert(1_100_000_000_000L, "Bits per second", "Tebibits per second");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testKilobitsPerSecondToBitsPerSecond() {
        double result = converter.convert(1, "Kilobits per second", "Bits per second");
        assertEquals(1000.000, result, 0.001);
    }

    @Test
    void testMegabitsPerSecondToBitsPerSecond() {
        double result = converter.convert(1, "Megabits per second", "Bits per second");
        assertEquals(1_000_000.000, result, 0.001);
    }

    @Test
    void testGigabitsPerSecondToBitsPerSecond() {
        double result = converter.convert(1, "Gigabits per second", "Bits per second");
        assertEquals(1_000_000_000.000, result, 0.001);
    }

    @Test
    void testTerabitsPerSecondToBitsPerSecond() {
        double result = converter.convert(1, "Terabits per second", "Bits per second");
        assertEquals(1_000_000_000_000.000, result, 0.001);
    }
}