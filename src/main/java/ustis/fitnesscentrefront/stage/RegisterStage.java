package ustis.fitnesscentrefront.stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ustis.fitnesscentrefront.HelloApplication;
import ustis.fitnesscentrefront.StateManager;

import java.io.IOException;

public class RegisterStage implements StageInterface {
    @Override
    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 600);
        Stage stage = StateManager.getInstance().stage();

        stage.setTitle("Регистрация");
        stage.setScene(scene);
        stage.show();
    }
}
