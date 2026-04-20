package main;

import main.Commands.Command;
import main.Commands.ConvertCommand;
import main.Conversions.ConversionStrategy;
import main.Conversions.ConverterFactory;
import main.Observer.ConversionSubject;

public class ConversionModel {
    private final ConversionSubject subject = new ConversionSubject();

    public ConversionSubject getSubject() {
        return subject;
    }

    public ConversionStrategy getStrategy(String type) {
        return ConverterFactory.getConverter(type);
    }

    public Command createConvertCommand(double value, String fromUnit, String toUnit) {
        return new ConvertCommand(subject, value, fromUnit, toUnit);
    }
}