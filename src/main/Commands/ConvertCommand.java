package main.Commands;

import main.ConversionSubject;

public class ConvertCommand implements Command{
    private final ConversionSubject subject;
    private final double value;
    private final String fromUnit;
    private final String toUnit;

    public ConvertCommand(ConversionSubject subject, double value, String fromUnit, String toUnit) {
        this.subject = subject;
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    @Override
    public void execute() {
        subject.setConversion(value, fromUnit, toUnit);
    }
}