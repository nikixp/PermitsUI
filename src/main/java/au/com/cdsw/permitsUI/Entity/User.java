package au.com.cdsw.permitsUI.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String username;
    private String password;

//    private String givenName;
//    private String familyName;

    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;

//        this.givenName = givenName;
//        this.familyName = familyName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getGivenName() {
//        return givenName;
//    }
//
//    public void setGivenName(String givenName) {
//        this.givenName = givenName;
//    }
//
//    public String getFamilyName() {
//        return familyName;
//    }
//
//    public void setFamilyName(String familyName) {
//        this.familyName = familyName;
//    }

    @Override
    public String toString() {
        return "User{" +
                ", email='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
