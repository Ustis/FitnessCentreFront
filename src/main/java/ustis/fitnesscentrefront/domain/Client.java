package ustis.fitnesscentrefront.domain;

public class Client {
    private String id;
    private String phoneNumber;
    private String fullName;
    private String birthdayDate;
    private String gender;
    private String roles;
    private String balance;

    public Client() {
    }

    public Client(String id, String phoneNumber, String fullName, String birthdayDate, String gender, String roles, String balance) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.birthdayDate = birthdayDate;
        this.gender = gender;
        this.roles = roles;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
