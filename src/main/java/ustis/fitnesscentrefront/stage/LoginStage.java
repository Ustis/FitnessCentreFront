package ustis.fitnesscentrefront.stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ustis.fitnesscentrefront.HelloApplication;
import ustis.fitnesscentrefront.StateManager;

import java.io.IOException;

public class LoginStage implements StageInterface {
    @Override
    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = StateManager.getInstance().stage();

        stage.setTitle("Вход в аккаунт");
        stage.setScene(scene);
        stage.show();
    }
}
