package ustis.fitnesscentrefront;

import javafx.stage.Stage;

public class StateManager {
    private Stage stage;

    private String token = null;

    private StateManager() {
    }

    public Stage stage() {
        return stage;
    }

    public void setMainStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token, String tokenType) {
        this.token = tokenType + " " + token;
    }

    private static class StateManagerHolder {
        public static final StateManager INSTANCE = new StateManager();
    }

    public static StateManager getInstance() {
        return StateManagerHolder.INSTANCE;
    }
}
