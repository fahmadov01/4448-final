package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VolumeConversionTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Volume");

    @Test
    void testTeaspoonsToTablespoons() {
        double result = converter.convert(3, "US teaspoons", "US tablespoons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToFluidOunces() {
        double result = converter.convert(6, "US teaspoons", "US fluid ounces");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToCups() {
        double result = converter.convert(48.692, "US teaspoons", "US legal cups");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToPints() {
        double result = converter.convert(192, "US teaspoons", "US liquid pints");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToQuarts() {
        double result = converter.convert(384, "US teaspoons", "US liquid quarts");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToGallons() {
        double result = converter.convert(768, "US teaspoons", "US liquid gallons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToMilliliters() {
        double result = converter.convert(4.929, "US teaspoons", "Milliliters");
        assertEquals(24.29, result, 0.001);
    }

    @Test
    void testTeaspoonsToLiters() {
        double result = converter.convert(203, "US teaspoons", "Liters");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialTeaspoons() {
        double result = converter.convert(1.201, "US teaspoons", "Imperial teaspoons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialTablespoons() {
        double result = converter.convert(3.603, "US teaspoons", "Imperial tablespoons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialFluidOunces() {
        double result = converter.convert(5.765, "US teaspoons", "Imperial fluid ounces");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialCups() {
        double result = converter.convert(57.646, "US teaspoons", "Imperial cups");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialPints() {
        double result = converter.convert(115, "US teaspoons", "Imperial pints");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialQuarts() {
        double result = converter.convert(231, "US teaspoons", "Imperial quarts");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToImperialGallons() {
        double result = converter.convert(992, "US teaspoons", "Imperial gallons");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToCubicInches() {
        double result = converter.convert(3.325, "US teaspoons", "Cubic inches");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToCubicFeet() {
        double result = converter.convert(5745, "US teaspoons", "Cubic feet");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testTeaspoonsToTeaspoons() {
        double result = converter.convert(123.456, "US teaspoons", "US teaspoons");
        assertEquals(123.456, result, 0.001);
    }

    @Test
    void testTablespoonsToTeaspoons() {
        double result = converter.convert(1, "US tablespoons", "US teaspoons");
        assertEquals(3.000, result, 0.001);
    }

    @Test
    void testGallonsToTeaspoons() {
        double result = converter.convert(1, "US liquid gallons", "US teaspoons");
        assertEquals(768.000, result, 0.001);
    }

    @Test
    void testLitersToTeaspoons() {
        double result = converter.convert(1, "Liters", "US teaspoons");
        assertEquals(203.000, result, 0.001);
    }

    @Test
    void testMillilitersToTeaspoons() {
        double result = converter.convert(1, "Milliliters", "US teaspoons");
        assertEquals(0.202, result, 0.001);
    }
}