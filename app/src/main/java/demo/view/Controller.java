package demo.view;

import demo.view.validation.Principal;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

    private final Stage stage;

    public Controller(Stage stage) {
        this.stage = stage;
        this.stage.setTitle("Login");

        Principal principal = new Principal(stage);

        stage.setScene(principal.getScene());
    }

    public void startStage() {

        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

}
