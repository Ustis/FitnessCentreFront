package ustis.fitnesscentrefront.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ustis.fitnesscentrefront.domain.Client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AdminApi {
    private FitnessCentreApi notebookApi = FitnessCentreApi.getInstance();

    public List<Client> getAll() throws IOException {
        SimpleResponse response = notebookApi.get("/admin/getClients");

        Type clientListType = new TypeToken<ArrayList<Client>>() {}.getType();

        return new Gson().fromJson(response.getBodyJson(), clientListType);
    }

    public void save(Client client) throws IOException {
        SimpleResponse response = notebookApi.post("/admin/changeClient", new Gson().toJson(client));
    }
}
