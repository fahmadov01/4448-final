package main;

import main.Commands.Command;
import main.Observer.ConversionObserver;

import java.util.List;

public class UnitConverterController {
    private final ConversionModel model;
    private final UnitConverterView view;
    private final ConversionObserver observer;

    public UnitConverterController(ConversionModel model, UnitConverterView view) {
        this.model = model;
        this.view = view;
        this.observer = new ConversionObserver(view.secondInput, null);
        model.getSubject().addObserver(observer);
        init();
    }

    private void init() {

        view.unitType.getItems().addAll(
                "Area","Data Transfer Rate","Digital Storage","Energy","Frequency",
                "Fuel Economy","Length","Mass","Speed","Temperature","Time",
                "Plane Angle","Pressure","Volume"
        );

        view.unitType.setValue("Area");

        view.unitType.setOnAction(e ->
                updateUnits(view.unitType.getValue())
        );

        updateUnits(view.unitType.getValue());

        view.convertBtn.setOnAction(e -> convert());
    }

    private void updateUnits(String type) {
        var strategy = model.getStrategy(type);
        observer.setStrategy(strategy);

        List<String> units = strategy.getUnits();

        view.firstUnit.getItems().setAll(units);
        view.secondUnit.getItems().setAll(units);

        if (!units.isEmpty()) {
            view.firstUnit.getSelectionModel().selectFirst();
            view.secondUnit.getSelectionModel().select(1);
        }
    }

    private void convert() {

        if (view.unitType.getValue() == null ||
                view.firstUnit.getValue() == null ||
                view.secondUnit.getValue() == null ||
                view.firstInput.getText().isEmpty()) {
            return;
        }

        double value;

        try {
            value = Double.parseDouble(view.firstInput.getText());
        } catch (NumberFormatException e) {
            view.secondInput.setText("");
            return;
        }

        Command command = model.createConvertCommand(
                value,
                view.firstUnit.getValue(),
                view.secondUnit.getValue()
        );

        command.execute();
    }
}