package ustis.fitnesscentrefront;

import javafx.application.Application;
import javafx.stage.Stage;
import ustis.fitnesscentrefront.control.SimplePopupDialog;
import ustis.fitnesscentrefront.stage.LoginStage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StateManager.getInstance().setMainStage(stage);
        new LoginStage().load();
    }

    private static void showError(Thread t, Throwable e) {
        System.err.println("***Default exception handler***");
        System.err.println("An unexpected error occurred in " + e.toString());
        showErrorDialog(e);
    }

    private static void showErrorDialog(Throwable e) {
        StringWriter errorMsg = new StringWriter();
        e.printStackTrace(new PrintWriter(errorMsg));

        new SimplePopupDialog().show(StateManager.getInstance().getStage(),
                new Exception(e.getCause().getCause()).getMessage());
    }

    public static void main(String[] args) {
        launch();
    }
}