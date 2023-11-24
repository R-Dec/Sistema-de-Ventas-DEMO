package demo.view.content;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ContentStage {

    private Stage stage;
    private Scene scene;
    private VBox vBox;

    public ContentStage() {

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        CloseBarContent closeBarContent = new CloseBarContent(this);
        Content content = new Content();

        vBox = new VBox();
        vBox.getChildren().addAll(closeBarContent.getStackPane(), content.getStackPane());

        scene = new Scene(vBox, bounds.getWidth(), bounds.getHeight());

        stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);

    }

    public void startStage() {
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

}
