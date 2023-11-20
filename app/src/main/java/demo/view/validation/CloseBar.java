package demo.view.validation;

import demo.view.Controller;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class CloseBar {

    private StackPane stackPane;
    private Button button;

    public CloseBar(Controller controller) {

        stackPane = new StackPane();
        stackPane.getStyleClass().add("close-bar");

        button = new Button("X");
        button.getStyleClass().add("button");

        button.setOnAction(event -> controller.closeStage());

        stackPane.getChildren().add(button);

        stackPane.setPrefHeight(24);
        stackPane.setPrefWidth(432);
        stackPane.setAlignment(Pos.CENTER_RIGHT);

        stackPane.getStylesheets().add("styles/CloseBar.css");

    }

    public StackPane getStackPane() {

        return stackPane;

    }
}
