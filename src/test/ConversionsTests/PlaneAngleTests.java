package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaneAngleTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Plane Angle");

    @Test
    void testSecondsOfArcToMinutesOfArc() {
        double result = converter.convert(60, "Seconds of Arc", "Minutes of Arc");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testSecondsOfArcToDegrees() {
        double result = converter.convert(3600, "Seconds of Arc", "Degrees");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testSecondsOfArcToGradians() {
        double result = converter.convert(3240, "Seconds of Arc", "Gradians");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testSecondsOfArcToMilliradians() {
        double result = converter.convert(648, "Seconds of Arc", "Milliradians");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testSecondsOfArcToRadians() {
        double result = converter.convert(648000 / Math.PI, "Seconds of Arc", "Radians");
        assertEquals(1.000, result, 0.001);
    }

    @Test
    void testMinutesOfArcToSecondsOfArc() {
        double result = converter.convert(1, "Minutes of Arc", "Seconds of Arc");
        assertEquals(60.000, result, 0.001);
    }

    @Test
    void testDegreesToSecondsOfArc() {
        double result = converter.convert(1, "Degrees", "Seconds of Arc");
        assertEquals(3600.000, result, 0.001);
    }

    @Test
    void testGradiansToSecondsOfArc() {
        double result = converter.convert(1, "Gradians", "Seconds of Arc");
        assertEquals(3240.000, result, 0.001);
    }

    @Test
    void testMilliradiansToSecondsOfArc() {
        double result = converter.convert(1, "Milliradians", "Seconds of Arc");
        assertEquals(648.000, result, 0.001);
    }

    @Test
    void testRadiansToSecondsOfArc() {
        double result = converter.convert(1, "Radians", "Seconds of Arc");
        assertEquals(648000 / Math.PI, result, 0.001);
    }

    @Test
    void testSecondsOfArcToSecondsOfArc() {
        double result = converter.convert(1234, "Seconds of Arc", "Seconds of Arc");
        assertEquals(1234.000, result, 0.001);
    }
}