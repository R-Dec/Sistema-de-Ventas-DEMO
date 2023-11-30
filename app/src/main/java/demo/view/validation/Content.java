package demo.view.validation;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Content {

    private StackPane stackPane;
    private VBox vBox;

    private StackPane labelPane;
    private Label label;
    private VBox vBoxFields;
    private TextField userField;
    private PasswordField passField;
    private StackPane buttonPane;
    private Button button;

    public Content(Stage newStage) {
        stackPane = new StackPane();

        label = new Label("Login your account");
        label.getStyleClass().add("label");

        labelPane = new StackPane();
        labelPane.getChildren().add(label);

        userField = new TextField();
        userField.getStyleClass().add("user-field");
        userField.setPromptText("username");
        userField.setPrefHeight(29);
        userField.setPrefWidth(206);

        passField = new PasswordField();
        passField.getStyleClass().add("pass-field");
        passField.setPromptText("password");
        passField.setPrefHeight(29);
        passField.setPrefWidth(206);

        vBoxFields = new VBox();
        vBoxFields.getChildren().addAll(userField, passField);
        vBoxFields.setSpacing(16);

        button = new Button("Sign in");
        button.getStyleClass().add("button");
        button.setPrefHeight(35);
        button.setPrefWidth(206);

        buttonPane = new StackPane();
        buttonPane.getChildren().add(button);

        button.setOnAction(event -> newStage.close());

        vBox = new VBox();
        vBox.getChildren().addAll(labelPane, vBoxFields, buttonPane);
        vBox.setSpacing(32);

        stackPane.getChildren().add(vBox);
        stackPane.getStyleClass().add("stack-pane");
        stackPane.setPrefHeight(272);
        stackPane.setPrefWidth(270);

        stackPane.getStylesheets().add("validation/Content.css");
    }

    public StackPane getStackPane() {
        return stackPane;
    }
}
