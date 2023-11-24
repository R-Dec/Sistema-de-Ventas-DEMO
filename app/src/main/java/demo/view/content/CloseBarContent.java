package demo.view.content;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class CloseBarContent {

    private StackPane stackPane;
    private Button button;

    public CloseBarContent(ContentStage contentStage) {

        stackPane = new StackPane();
        stackPane.getStyleClass().add("close-bar");

        button = new Button("X");
        button.getStyleClass().add("button");

        button.setOnAction(event -> contentStage.getStage().close());

        stackPane.getChildren().add(button);

        stackPane.setPrefHeight(32);
        stackPane.setMaxHeight(32);
        stackPane.setPrefWidth(1440);
        stackPane.setAlignment(Pos.CENTER_RIGHT);

        stackPane.getStylesheets().add("styles/CloseBarContent.css");

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
