package ustis.fitnesscentrefront.api;

import com.google.gson.Gson;
import ustis.fitnesscentrefront.api.dto.CardPriceResponse;

import java.io.IOException;

public class ClubCardApi {
    private FitnessCentreApi api = FitnessCentreApi.getInstance();

    public boolean isCardActive() throws IOException {
        SimpleResponse simpleResponse = api.get("/clubCard/isCardActive");

        return new Gson().fromJson(simpleResponse.getBodyJson(), boolean.class);
    }

    public CardPriceResponse cardPrice() throws IOException {
        SimpleResponse response = api.get("/clubCard/cardPrice");

        return new Gson().fromJson(response.getBodyJson(), CardPriceResponse.class);
    }

    public void buyCard() throws IOException {
        api.post("/clubCard/buyCard");
    }
}
