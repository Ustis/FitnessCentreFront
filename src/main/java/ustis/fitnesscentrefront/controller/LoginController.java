package ustis.fitnesscentrefront.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ustis.fitnesscentrefront.StateManager;
import ustis.fitnesscentrefront.api.AuthApi;
import ustis.fitnesscentrefront.api.dto.LoginRequest;
import ustis.fitnesscentrefront.api.dto.LoginResponse;
import ustis.fitnesscentrefront.stage.RegisterStage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField phoneNumberTF;
    @FXML
    private PasswordField passwordTF;
    @FXML
    protected void onLoginButtonClick() throws IOException {
        // TODO обрабатывать ощибки в ответе
        LoginResponse response = new AuthApi().login(
                new LoginRequest(phoneNumberTF.getText(), passwordTF.getText())
        );
        StateManager.getInstance().setToken(response.getAccessToken(), response.getType());
    }

    @FXML
    protected void onRegisterButtonClick() throws IOException {
        new RegisterStage().load();
    }
}
