package ustis.fitnesscentrefront.api.dto;

public class LoginResponse {
    public String type;
    public String accessToken;

    public String roles;

    public LoginResponse(String type, String accessToken, String roles) {
        this.type = type;
        this.accessToken = accessToken;
        this.roles = roles;
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
