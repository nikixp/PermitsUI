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

    private List<String> fundingSource;

    private User user;

    public Customer(){}

    public Customer(String email, String givenName, String familyName, List<Vehicle> vehicles, List<String> fundingSource, User user) {
        this.email = email;
        this.givenName = givenName;
        this.familyName = familyName;
        this.vehicles = vehicles;
        this.fundingSource = fundingSource;
        this.user = user;
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

    public List<String> getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(List<String> fundingSource) {
        this.fundingSource = fundingSource;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", vehicles=" + vehicles +
                ", fundingSource=" + fundingSource +
                ", user=" + user +
                '}';
    }
}
