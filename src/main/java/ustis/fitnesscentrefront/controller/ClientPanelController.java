package ustis.fitnesscentrefront.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ustis.fitnesscentrefront.api.ClubCardApi;
import ustis.fitnesscentrefront.api.VisitApi;
import ustis.fitnesscentrefront.api.dto.CardPriceResponse;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientPanelController implements Initializable {
    private ClubCardApi clubCardApi = new ClubCardApi();

    private VisitApi visitApi = new VisitApi();

    @FXML
    private Label balanceL;

    @FXML
    private Label cardPrice;

    @FXML
    private Button buyCardBTN;

    @FXML
    private Button enterCentreBTN;

    @FXML
    private Button leaveCentreBTN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            if (clubCardApi.isCardActive()) {
                setActiveCardState();
            } else {
                setUnactiveCardState();
            }

            CardPriceResponse cardPriceResponse = clubCardApi.cardPrice();
            cardPrice.setText("Цена карты для вас " + cardPriceResponse.getCardPrice());
            balanceL.setText("Текущий баланс " + cardPriceResponse.getBalance());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onBuyCardClick() throws IOException {
        clubCardApi.buyCard();
        setActiveCardState();
    }

    @FXML
    protected void onEnterCentreClick() throws IOException {
        visitApi.enterClub();
    }

    @FXML
    protected void onLeaveCentreClick() throws IOException {
        visitApi.leaveClub();
    }

    private void setUnactiveCardState() {
        buyCardBTN.setVisible(true);

        enterCentreBTN.setVisible(false);
        leaveCentreBTN.setVisible(false);
    }

    private void setActiveCardState() {
        enterCentreBTN.setVisible(true);
        leaveCentreBTN.setVisible(true);

        buyCardBTN.setVisible(false);
    }
}
