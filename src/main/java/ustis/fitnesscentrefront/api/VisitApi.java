package ustis.fitnesscentrefront.api;

import java.io.IOException;

public class VisitApi {
    private FitnessCentreApi api = FitnessCentreApi.getInstance();

    public void enterClub() throws IOException {
        api.post("/visit/arrival");
    }

    public void leaveClub() throws IOException {
        api.post("/visit/leaving");
    }
}
