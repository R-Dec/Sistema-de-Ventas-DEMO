package demo.view;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Principal {

    private final Stage stage;

    public Principal(Stage stage) {
        this.stage = stage;
        this.stage.setTitle("Login");
    }

    public void startStage() {
        Controller controller = new Controller();

        stage.setScene(controller.getScene());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
}
