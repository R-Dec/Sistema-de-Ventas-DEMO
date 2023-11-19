package demo.view;

import javafx.stage.Stage;

public class Login {

    private final Stage stage;

    public Login(Stage stage) {

        this.stage = stage;
        this.stage.setTitle("Login");

    }

    public void startStage() {

        stage.show();
    }

}
