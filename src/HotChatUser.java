public class HotChatUser {

    String userID;
    String login;
    String password;
    String email;
    String gender;
    String city;
    String country;

    public HotChatUser(String userID, String login, String password, String email, String gender, String city, String country) {
        this.userID = userID;
        this.login = login;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.city = city;
        this.country = country;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
