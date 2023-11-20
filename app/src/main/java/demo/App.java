package demo;

import demo.view.Principal;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    public void start(Stage stage) {

        Principal login = new Principal(stage);
        login.startStage();

    }
}