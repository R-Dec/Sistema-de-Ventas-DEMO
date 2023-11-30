package demo.view.validation;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal {

    private Scene scene;
    private VBox vBox;

    public Principal(Stage stage) {

        vBox = new VBox();

        CloseBar closeBar = new CloseBar(stage);
        Content content = new Content(stage);

        vBox.getChildren().addAll(closeBar.getStackPane(), content.getStackPane());

        scene = new Scene(vBox);

    }

    public Scene getScene() {
        return scene;
    }

}
