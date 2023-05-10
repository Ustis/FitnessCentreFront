package ustis.fitnesscentrefront.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ustis.fitnesscentrefront.api.AuthApi;
import ustis.fitnesscentrefront.api.dto.RegisterRequest;
import ustis.fitnesscentrefront.stage.LoginStage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class RegisterController {
    @FXML
    private TextField phoneNumberTF;

    @FXML
    private PasswordField passwordTF;

    @FXML
    private PasswordField passwordConfirmationTF;

    @FXML
    private TextField fullNameTF;

    @FXML
    private DatePicker birthdayDateDP;

    @FXML
    private ChoiceBox<String> genderCB;

    @FXML
    protected void onRegisterButtonClick() throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // TODO проврека на пароль
        try {
            new AuthApi().register(new RegisterRequest(
                    phoneNumberTF.getText(),
                    passwordTF.getText(),
                    passwordConfirmationTF.getText(),
                    fullNameTF.getText(),
                    birthdayDateDP.getValue().format(formatter),
                    genderCB.getValue()
            ));
        } catch (IOException e){
            throw e;
        }
        onReturnToLoginClick();
    }

    @FXML
    private void onReturnToLoginClick() throws IOException {
        new LoginStage().load();
    }
}

