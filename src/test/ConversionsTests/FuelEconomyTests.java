package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuelEconomyTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Fuel Economy");

    @Test
    void testMilesPerGallonToImperial() {
        double result = converter.convert(1, "Miles per gallon", "Miles per gallon(Imperial)");
        assertEquals(0.832, result, 0.001);
    }

    @Test
    void testMilesPerGallonToKilometersPerLiter() {
        double result = converter.convert(1, "Miles per gallon", "Kilometers per liter");
        assertEquals(0.425, result, 0.001);
    }

    @Test
    void testImperialToMilesPerGallon() {
        double result = converter.convert(1, "Miles per gallon(Imperial)", "Miles per gallon");
        assertEquals(1.201, result, 0.001);
    }

    @Test
    void testKilometersPerLiterToMilesPerGallon() {
        double result = converter.convert(1, "Kilometers per liter", "Miles per gallon");
        assertEquals(2.352, result, 0.001);
    }

    @Test
    void testMilesPerGallonToMilesPerGallon() {
        double result = converter.convert(5.5, "Miles per gallon", "Miles per gallon");
        assertEquals(5.500, result, 0.001);
    }
}