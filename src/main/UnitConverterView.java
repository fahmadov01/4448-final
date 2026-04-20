package main;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class UnitConverterView {
    public ComboBox<String> unitType = new ComboBox<>();
    public TextField firstInput = new TextField();
    public TextField secondInput = new TextField();

    public ComboBox<String> firstUnit = new ComboBox<>();
    public ComboBox<String> secondUnit = new ComboBox<>();

    public Button convertBtn = new Button("Convert");

    public Scene buildScene() {
        secondInput.setEditable(false);
        firstInput.setPrefWidth(200);
        secondInput.setPrefWidth(200);
        firstUnit.setPrefWidth(200);
        secondUnit.setPrefWidth(200);
        unitType.setPrefWidth(480);

        VBox leftColumn = new VBox(0, firstInput, firstUnit);
        VBox rightColumn = new VBox(0, secondInput, secondUnit);

        leftColumn.setStyle("-fx-alignment: center;");
        rightColumn.setStyle("-fx-alignment: center;");

        Label equalSign = new Label("=");
        equalSign.setStyle("-fx-font-size: 28; -fx-padding: 0 10 0 10;");

        HBox topRow = new HBox(20, leftColumn, equalSign, rightColumn);
        topRow.setStyle("-fx-alignment: center;");

        VBox root = new VBox(5, unitType, topRow, convertBtn);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        return new Scene(root, 800, 500);
    }
}