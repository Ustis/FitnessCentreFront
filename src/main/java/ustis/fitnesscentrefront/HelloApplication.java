package ustis.fitnesscentrefront;

import javafx.application.Application;
import javafx.stage.Stage;
import ustis.fitnesscentrefront.stage.LoginStage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StateManager.getInstance().setMainStage(stage);
        new LoginStage().load();
    }

    public static void main(String[] args) {
        launch();
    }
}