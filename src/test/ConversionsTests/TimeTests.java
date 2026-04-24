package test.ConversionsTests;

import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTests {

    private final ConversionStrategy converter = ConverterFactory.getConverter("Time");

    @Test
    void testSecondsToMinutes() {
        double result = converter.convert(120, "Seconds", "Minutes");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToHours() {
        double result = converter.convert(7200, "Seconds", "Hours");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToDays() {
        double result = converter.convert(172800, "Seconds", "Days");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToWeeks() {
        double result = converter.convert(1209600, "Seconds", "Weeks");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToMonths() {
        double result = converter.convert(5259492, "Seconds", "Months");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToCalendarYears() {
        double result = converter.convert(63113840, "Seconds", "Calendar Years");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToLeapYears() {
        double result = converter.convert(63244800, "Seconds", "Leap Years");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToDecades() {
        double result = converter.convert(631138104, "Seconds", "Decades");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testSecondsToCenturies() {
        double result = converter.convert(6311381040L, "Seconds", "Centuries");
        assertEquals(2.000, result, 0.001);
    }

    @Test
    void testMinutesToSeconds() {
        double result = converter.convert(3, "Minutes", "Seconds");
        assertEquals(180.000, result, 0.001);
    }

    @Test
    void testHoursToSeconds() {
        double result = converter.convert(1.5, "Hours", "Seconds");
        assertEquals(5400.000, result, 0.001);
    }

    @Test
    void testDaysToSeconds() {
        double result = converter.convert(2, "Days", "Seconds");
        assertEquals(172800.000, result, 0.001);
    }

    @Test
    void testWeeksToSeconds() {
        double result = converter.convert(0.5, "Weeks", "Seconds");
        assertEquals(302400.000, result, 0.001);
    }

    @Test
    void testMonthsToSeconds() {
        double result = converter.convert(1, "Months", "Seconds");
        assertEquals(2629746.000, result, 0.001);
    }

    @Test
    void testCalendarYearsToSeconds() {
        double result = converter.convert(1, "Calendar Years", "Seconds");
        assertEquals(31556952.000, result, 0.001);
    }

    @Test
    void testLeapYearsToSeconds() {
        double result = converter.convert(1, "Leap Years", "Seconds");
        assertEquals(31622400.000, result, 0.001);
    }

    @Test
    void testDecadesToSeconds() {
        double result = converter.convert(1, "Decades", "Seconds");
        assertEquals(315569520.000, result, 0.001);
    }

    @Test
    void testCenturiesToSeconds() {
        double result = converter.convert(1, "Centuries", "Seconds");
        assertEquals(3155695200.000, result, 0.001);
    }

    @Test
    void testSecondsToSeconds() {
        double result = converter.convert(123.456, "Seconds", "Seconds");
        assertEquals(123.456, result, 0.001);
    }
}