package main;

import javafx.application.Application;
import javafx.stage.Stage;

public class UnitConverterUI extends Application {

    @Override
    public void start(Stage stage) {
        ConversionModel model = new ConversionModel();
        UnitConverterView view = new UnitConverterView();

        new UnitConverterController(model, view);

        stage.setScene(view.buildScene());
        stage.setTitle("Unit Converter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}