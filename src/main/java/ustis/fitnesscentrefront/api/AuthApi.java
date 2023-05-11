package ustis.fitnesscentrefront.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ustis.fitnesscentrefront.api.dto.LoginRequest;
import ustis.fitnesscentrefront.api.dto.LoginResponse;
import ustis.fitnesscentrefront.api.dto.RegisterRequest;

import java.io.IOException;
import java.lang.reflect.Type;

public class AuthApi {
    private FitnessCentreApi api = FitnessCentreApi.getInstance();

    public void register(RegisterRequest registerRequest) throws IOException {
        SimpleResponse response = api.post("/auth/register", new Gson().toJson(registerRequest));
    }

    public LoginResponse login(LoginRequest loginRequest) throws IOException {
        SimpleResponse response = api.post("/auth/login", new Gson().toJson(loginRequest));
        Type loginResponseType = new TypeToken<LoginResponse>() {
        }.getType();
        return new Gson().fromJson(response.getBodyJson(), loginResponseType);
    }
}
