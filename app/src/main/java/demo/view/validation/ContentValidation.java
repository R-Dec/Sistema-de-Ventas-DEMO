package demo.view.validation;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContentValidation {

    private StackPane stackPane;
    private VBox vBox;

    private Label label;
    private VBox credentialsVBox;
    private PasswordField userField;
    private PasswordField passwordField;
    private Button button;

    public ContentValidation() {

        label = new Label("User Validation");
        label.getStyleClass().add("label");

        userField = new PasswordField();
        userField.setPromptText("User");

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        button = new Button("Enter");

        credentialsVBox = new VBox();
        credentialsVBox.getChildren().addAll(userField, passwordField);

        vBox = new VBox();
        vBox.getChildren().addAll(label, credentialsVBox, button);

        stackPane = new StackPane();
        stackPane.getChildren().add(vBox);

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
