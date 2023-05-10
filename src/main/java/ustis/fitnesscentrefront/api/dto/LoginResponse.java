package ustis.fitnesscentrefront.api.dto;

public class LoginResponse {
    public String type;
    public String accessToken;

    public LoginResponse(String type, String accessToken) {
        this.type = type;
        this.accessToken = accessToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
