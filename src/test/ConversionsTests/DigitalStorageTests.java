package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitalStorageTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Digital Storage");

    @Test
    void testBitsToKilobits() {
        double result = converter.convert(126, "Bits", "Kilobits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToKibibytes() {
        double result = converter.convert(128, "Bits", "Kibibits");
        assertEquals(0.125, result, 0.001);
    }

    @Test
    void testBitsToMegabits() {
        double result = converter.convert(125000, "Bits", "Megabits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToMebibits() {
        double result = converter.convert(131072, "Bits", "Mebibits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToGigabits() {
        double result = converter.convert(125000000, "Bits", "Gigabits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToGibibits() {
        double result = converter.convert(134200000, "Bits", "Gibibits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToTerabits() {
        double result = converter.convert(125000000000L, "Bits", "Terabits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToTebibits() {
        double result = converter.convert(137400000000L, "Bits", "Tebibits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToPetabits() {
        double result = converter.convert(125000000000000L, "Bits", "Petabits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToPebibits() {
        double result = converter.convert(140700000000000L, "Bits", "Pebibits");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToBytes() {
        double result = converter.convert(8, "Bits", "Bytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToKilobytes() {
        double result = converter.convert(1000, "Bits", "Kilobytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToMegabytes() {
        double result = converter.convert(1_000_000, "Bits", "Megabytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToMebibytes() {
        double result = converter.convert(1_049_000, "Bits", "Mebibytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToGigabytes() {
        double result = converter.convert(1_000_000_000, "Bits", "Gigabytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToGibibytes() {
        double result = converter.convert(1_074_000_000, "Bits", "Gibibytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToTerabytes() {
        double result = converter.convert(1_000_000_000_000L, "Bits", "Terabytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToTebibytes() {
        double result = converter.convert(1_100_000_000_000L, "Bits", "Tebibytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToPetabytes() {
        double result = converter.convert(1_000_000_000_000_000L, "Bits", "Petabytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testBitsToPebibytes() {
        double result = converter.convert(1_126_000_000_000_000L, "Bits", "Pebibytes");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testKilobitsToBits() {
        double result = converter.convert(1, "Kilobits", "Bits");
        assertEquals(126.000, result, 0.001);
    }

    @Test
    void testMegabitsToBits() {
        double result = converter.convert(1, "Megabits", "Bits");
        assertEquals(125000.000, result, 0.001);
    }

    @Test
    void testGigabitsToBits() {
        double result = converter.convert(1, "Gigabits", "Bits");
        assertEquals(125000000.000, result, 0.001);
    }

    @Test
    void testTerabitsToBits() {
        double result = converter.convert(1, "Terabits", "Bits");
        assertEquals(125000000000.000, result, 0.001);
    }

    @Test
    void testPetabitsToBits() {
        double result = converter.convert(1, "Petabits", "Bits");
        assertEquals(125000000000000.000, result, 0.001);
    }

    @Test
    void testBytesToBits() {
        double result = converter.convert(1, "Bytes", "Bits");
        assertEquals(8.000, result, 0.001);
    }

    @Test
    void testKilobytesToBits() {
        double result = converter.convert(1, "Kilobytes", "Bits");
        assertEquals(1000.000, result, 0.001);
    }

    @Test
    void testMegabytesToBits() {
        double result = converter.convert(1, "Megabytes", "Bits");
        assertEquals(1_000_000.000, result, 0.001);
    }

    @Test
    void testGigabytesToBits() {
        double result = converter.convert(1, "Gigabytes", "Bits");
        assertEquals(1_000_000_000.000, result, 0.001);
    }

    @Test
    void testTerabytesToBits() {
        double result = converter.convert(1, "Terabytes", "Bits");
        assertEquals(1_000_000_000_000.000, result, 0.001);
    }

    @Test
    void testPetabytesToBits() {
        double result = converter.convert(1, "Petabytes", "Bits");
        assertEquals(1_000_000_000_000_000.000, result, 0.001);
    }
}