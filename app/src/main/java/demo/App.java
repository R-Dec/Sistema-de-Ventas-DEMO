package demo;

import demo.view.Login;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    public void start(Stage stage) {

        Login login = new Login(stage);
        login.startStage();

    }
}
