package demo.view;

import demo.view.validation.CloseBar;
import demo.view.validation.ContentValidation;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Controller {

    private Scene scene;
    private StackPane stackPane;
    private VBox vBox;

    public Controller() {

        CloseBar closeBar = new CloseBar(this);
        ContentValidation contentValidation = new ContentValidation(this);

        vBox = new VBox();
        vBox.getChildren().addAll(closeBar.getStackPane(), contentValidation.getStackPane());

        stackPane = new StackPane();
        stackPane.getChildren().add(vBox);

        scene = new Scene(stackPane);

    }

    public Scene getScene() {

        return scene;

    }

    public void closeStage() {

        stackPane.getScene().getWindow().hide();

    }
}
