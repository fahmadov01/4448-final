package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

import main.Commands.Command;
import main.Commands.ConvertCommand;
import main.Conversions.ConverterFactory;
import main.Conversions.ConversionStrategy;

public class UnitConverterUI extends Application {
    private void updateUnits(String type, ConversionObserver observer, ComboBox<String> firstUnit, ComboBox<String> secondUnit) {
        ConversionStrategy strategy = ConverterFactory.getConverter(type);
        observer.setStrategy(strategy);

        List<String> units = strategy.getUnits();

        firstUnit.getItems().setAll(units);
        secondUnit.getItems().setAll(units);

        firstUnit.getSelectionModel().selectFirst();
        secondUnit.getSelectionModel().select(1);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Unit Converter");

        ComboBox<String> unitType = new ComboBox<>();
        unitType.getItems().addAll("Area","Data Transfer Rate","Digital Storage","Energy","Frequency","Fuel Economy",
                "Length","Mass","Speed","Temperature","Time","Plane Angle","Pressure","Volume");
        unitType.setValue("Area");
        unitType.setPrefWidth(480);

        TextField firstInput = new TextField();
        TextField secondInput = new TextField();
        secondInput.setEditable(false);

        ComboBox<String> firstUnit = new ComboBox<>();
        ComboBox<String> secondUnit = new ComboBox<>();

        firstInput.setPrefWidth(200);
        secondInput.setPrefWidth(200);
        firstUnit.setPrefWidth(200);
        secondUnit.setPrefWidth(200);

        VBox leftColumn = new VBox(0, firstInput, firstUnit);
        VBox rightColumn = new VBox(0, secondInput, secondUnit);

        leftColumn.setStyle("-fx-alignment: center;");
        rightColumn.setStyle("-fx-alignment: center;");

        Label equalSign = new Label("=");
        equalSign.setStyle("-fx-font-size: 28; -fx-padding: 0 10 0 10;");

        HBox topRow = new HBox(20, leftColumn, equalSign, rightColumn);
        topRow.setStyle("-fx-alignment: center;");

        Button convertBtn = new Button("Convert");

        VBox root = new VBox(5);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        root.getChildren().addAll(unitType, topRow, convertBtn);

        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        ConversionSubject subject = new ConversionSubject();

        ConversionObserver observer = new ConversionObserver(secondInput, null);
        subject.addObserver(observer);

        unitType.setOnAction(e -> updateUnits(unitType.getValue(), observer, firstUnit, secondUnit));
        updateUnits(unitType.getValue(), observer, firstUnit, secondUnit);

        convertBtn.setOnAction(e -> {
            if (unitType.getValue() == null || firstUnit.getValue() == null || secondUnit.getValue() == null || firstInput.getText().isEmpty()) {
                return;
            }

            double value;
            try {
                value = Double.parseDouble(firstInput.getText());
            } catch (NumberFormatException ex) {
                secondInput.setText("");
                return;
            }

            Command command = new ConvertCommand(subject, value, firstUnit.getValue(), secondUnit.getValue());
            command.execute();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}