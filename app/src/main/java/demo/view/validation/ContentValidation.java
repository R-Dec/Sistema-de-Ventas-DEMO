package demo.view.validation;

import demo.view.Controller;
import demo.view.content.ContentStage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContentValidation {

    private StackPane stackPane;
    private VBox vBox;

    private Label label;
    private VBox credentialsVBox;
    private TextField userField;
    private PasswordField passwordField;
    private Button button;
    Controller controller;

    public ContentValidation(Controller controller) {

        this.controller = controller;

        label = new Label("User Validation");
        label.getStyleClass().add("label");
        label.getStyleClass().add("label");

        userField = new TextField();
        userField.getStyleClass().add("user-field");
        userField.setPromptText("User");

        passwordField = new PasswordField();
        passwordField.getStyleClass().add("password-field");
        passwordField.setPromptText("Password");

        button = new Button("Enter");
        button.getStyleClass().add("button");

        // Acá trabajan los botones
        button.setOnAction(event -> {
            controller.closeStage();
            ContentStage contentStage = new ContentStage();
            contentStage.startStage();
        });

        credentialsVBox = new VBox();
        credentialsVBox.setSpacing(16);
        credentialsVBox.getChildren().addAll(userField, passwordField);

        vBox = new VBox();
        vBox.getStyleClass().add("vBox");
        vBox.setSpacing(24);
        vBox.getChildren().addAll(label, credentialsVBox, button);

        stackPane = new StackPane();
        stackPane.getStyleClass().add("content-validation");
        stackPane.getChildren().add(vBox);
        stackPane.setPrefHeight(314);
        stackPane.setPrefWidth(432);

        stackPane.getStylesheets().add("styles/ContentValidation.css");

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
