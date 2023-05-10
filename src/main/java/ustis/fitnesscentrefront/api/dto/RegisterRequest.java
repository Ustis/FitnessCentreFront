package ustis.fitnesscentrefront.api.dto;

public class RegisterRequest {
    public String phoneNumber;
    public String password;
    public String passwordConfirmation;
    public String fullName;
    public String birthdayDate;
    public String gender;

    public RegisterRequest(String phoneNumber, String password, String passwordConfirmation, String fullName, String birthdayDate, String gender) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
        this.fullName = fullName;
        this.birthdayDate = birthdayDate;
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
