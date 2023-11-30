package demo.view.validation;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseBar {

    private StackPane stackPane;
    private Button button;

    public CloseBar(Stage stage) {
        stackPane = new StackPane();
        stackPane.getStyleClass().add("stack-pane");

        button = new Button();
        button.getStyleClass().add("button");
        button.setText("Close");
        button.setMaxHeight(21);

        button.setOnAction(event -> stage.close());

        stackPane.setAlignment(Pos.CENTER_RIGHT);

        stackPane.getChildren().add(button);

        stackPane.setPrefHeight(21);
        stackPane.setPrefWidth(270);

        stackPane.getStylesheets().add("validation/CloseBar.css");
    }

    public StackPane getStackPane() {
        return stackPane;
    }

}
