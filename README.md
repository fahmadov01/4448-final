# Unit Converter

Team Members:

    Names: Farid Ahamdov

# CSCI 4448/5448 - Unit Converter

## Dependencies
To be able to run the UI part of the project, you will need the JavaFX SDK library. You will also need JUnit 5 for the unit tests.

## Patterns

1. My first pattern is the strategy pattern. The strategy pattern will encapsulate the conversion algorithms so that you can switch between different unit types (Length, Area, Volume, Temperature, etc.) without changing the UI or other code. I used this in the ConversionStategy interface, with each different conversion type getting its own class that implements ConversionStrategy (Area conversions in AreaConverter, Time conversions in TimeConverter and so on). 
2. My second pattern is the factory pattern. The factory pattern will encapsulate object creation, so the system decides which ConversionStrategy to use based on user input or configuration. I have a simple factory pattern class called ConverterFactory that gives the correct conversion class type based on the needed conversion type.
3. My third pattern is the observer pattern. The purpose of the observer pattern is to automatically update dependent UI components whenever the conversion input or selected units change. I will primarily use this for the UI, so that when one of the unit types changes or an input is changed, it will notify the ConversionObserver and correctly output the converted units. I have a basic Observer and Subject interface with a ConversionSubject that has all the observers in it to notify when the ConversionSubject is changed or updated.
4. My fourth pattern is the MVC pattern. This purpose of this pattern is to seperate the application into three interconnected components: Model, View, and Controller. The goal of this is to decouple data handling, user interface, and application logic.
5. My fifth and final pattern is the command pattern. The purpose of the command pattern is to encapsulate the conversion request as a standalone object, which allows it to be parametrized, stored, and executed independently of the objects that initiate or process it.
