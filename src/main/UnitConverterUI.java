package main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UnitConverterUI extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Unit Converter");

        ComboBox<String> unitType = new ComboBox<>();
        unitType.setPrefWidth(520);

        ComboBox<String> firstUnit = new ComboBox<>();
        firstUnit.setPrefWidth(240);

        TextField firstInput = new TextField();
        firstInput.setPrefWidth(240);

        ComboBox<String> secondUnit = new ComboBox<>();
        secondUnit.setPrefWidth(240);
        secondUnit.getSelectionModel().select(1);

        TextField secondInput = new TextField();
        secondInput.setPrefWidth(240);

        Label equalSign = new Label("=");

        VBox root = new VBox(20);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        HBox unitTypeBox = new HBox(10, unitType);
        unitTypeBox.setStyle("-fx-alignment: center;");

        HBox firstBox = new HBox(10, firstUnit, firstInput);
        firstBox.setStyle("-fx-alignment: center;");

        HBox secondBox = new HBox(10, equalSign, secondUnit, secondInput);
        secondBox.setStyle("-fx-alignment: center;");

        root.getChildren().addAll(unitTypeBox, firstBox, secondBox);

        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
