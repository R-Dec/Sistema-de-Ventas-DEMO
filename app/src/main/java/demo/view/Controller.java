package demo.view;

import demo.view.validation.CloseBar;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Controller {

    private Scene scene;
    private StackPane stackPane;

    public Controller() {

        CloseBar closeBar = new CloseBar(this);

        stackPane = new StackPane();
        stackPane.getChildren().add(closeBar.getStackPane());

        scene = new Scene(stackPane);

    }

    public Scene getScene() {

        return scene;

    }

    public void closeStage() {

        stackPane.getScene().getWindow().hide();

    }
}
