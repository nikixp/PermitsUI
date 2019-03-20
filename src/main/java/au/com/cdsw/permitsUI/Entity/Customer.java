package au.com.cdsw.permitsUI.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    private Long id;
    private String email;
    private String givenName;
    private String familyName;
    private List<Vehicle> vehicles;
    private User userId;

    public Customer(){}

    public Customer(String email, String givenName, String familyName, List<Vehicle> vehicles, User userId) {
        this.email = email;
        this.givenName = givenName;
        this.familyName = familyName;
        this.vehicles = vehicles;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public User getUser() {
        return userId;
    }

    public void setUser(User userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", vehicles=" + vehicles +
                ", userId=" + userId +
                '}';
    }
}
