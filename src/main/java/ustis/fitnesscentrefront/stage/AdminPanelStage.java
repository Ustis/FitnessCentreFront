package ustis.fitnesscentrefront.stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ustis.fitnesscentrefront.HelloApplication;
import ustis.fitnesscentrefront.StateManager;

import java.io.IOException;

public class AdminPanelStage implements StageInterface {
    @Override
    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("admin-panel-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 240);
        Stage stage = StateManager.getInstance().stage();

        stage.setTitle("Панель администратора");
        stage.setScene(scene);
        stage.show();
    }
}
