package ustis.fitnesscentrefront.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import ustis.fitnesscentrefront.api.AdminApi;
import ustis.fitnesscentrefront.domain.Client;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AdminPanelController implements Initializable {

    AdminApi api = new AdminApi();

    @FXML
    private TableView<Client> clientTableView;
    @FXML private TableColumn<Client, String> clientId;
    @FXML private TableColumn<Client, String> clientPhoneNumber;
    @FXML private TableColumn<Client, String> clientFullName;
    @FXML private TableColumn<Client, String> clientBirthdayDate;
    @FXML private TableColumn<Client, String> clientGender;
    @FXML private TableColumn<Client, String> clientRoles;
    @FXML private TableColumn<Client, String> clientBalance;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clientTableView.setEditable(true);

        clientId.setCellValueFactory(new PropertyValueFactory<>("id"));
        clientId.setEditable(false);
        clientPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        clientPhoneNumber.setCellFactory(TextFieldTableCell.forTableColumn());
        clientFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        clientFullName.setCellFactory(TextFieldTableCell.forTableColumn());
        clientBirthdayDate.setCellValueFactory(new PropertyValueFactory<>("birthdayDate"));
        clientBirthdayDate.setCellFactory(TextFieldTableCell.forTableColumn());
        clientGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        clientGender.setCellFactory(TextFieldTableCell.forTableColumn());
        clientRoles.setCellValueFactory(new PropertyValueFactory<>("roles"));
        clientRoles.setCellFactory(TextFieldTableCell.forTableColumn());
        clientBalance.setCellValueFactory(new PropertyValueFactory<>("balance"));
        clientBalance.setCellFactory(TextFieldTableCell.forTableColumn());

        try {
            fillTable();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillTable() throws IOException {
        List<Client> clients = api.getAll();
        clientTableView.getItems().addAll(clients);
    }

    public void changePhoneNumberCellEvent(TableColumn.CellEditEvent edittedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setPhoneNumber(edittedCell.getNewValue().toString());
        api.save(client);
    }

    public void changeFullNameCellEvent(TableColumn.CellEditEvent<Client, String> editedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setFullName(editedCell.getNewValue());
        api.save(client);
    }

    public void changeBirthdayDateCellEvent(TableColumn.CellEditEvent<Client, String> editedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setBirthdayDate(editedCell.getNewValue());
        api.save(client);
    }

    public void changeGenderCellEvent(TableColumn.CellEditEvent<Client, String> editedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setGender(editedCell.getNewValue());
        api.save(client);
    }

    public void changeRolesCellEvent(TableColumn.CellEditEvent<Client, String> editedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setRoles(editedCell.getNewValue());
        api.save(client);
    }

    public void changeBalanceCellEvent(TableColumn.CellEditEvent<Client, String> editedCell) throws IOException {
        Client client = clientTableView.getSelectionModel().getSelectedItem();
        client.setBalance(editedCell.getNewValue());
        api.save(client);
    }
}
