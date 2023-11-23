package demo.view.content;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ContentStage {

    private Stage stage;
    private Scene scene;

    public ContentStage() {

        CloseBarContent closeBarContent = new CloseBarContent(this);

        scene = new Scene(closeBarContent.getStackPane());

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
