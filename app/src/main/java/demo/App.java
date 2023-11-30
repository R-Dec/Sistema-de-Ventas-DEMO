package demo;

import demo.view.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Controller controller = new Controller(stage);
        controller.startStage();
    }
}