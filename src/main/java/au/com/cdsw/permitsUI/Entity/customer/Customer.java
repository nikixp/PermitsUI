package au.com.cdsw.permitsUI.Entity.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "version",
        "email",
        "givenName",
        "pushId",
        "deviceType",
        "familyName",
        "mobile",
        "user",
        "vehicles",
        "fundingSources",
        "availableBalance",
        "salaryParking",
        "newsletter",
        "country",
        "state",
        "address1",
        "address2",
        "zipCode",
        "citySuburb",
        "encodedPublicKey"
})
public class Customer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("email")
    private String email;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("pushId")
    private Object pushId;
    @JsonProperty("deviceType")
    private Object deviceType;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("user")
    private User user;
    @JsonProperty("vehicles")
    private List<Vehicle> vehicles = null;
    @JsonProperty("fundingSources")
    private List<FundingSource> fundingSources = null;
    @JsonProperty("availableBalance")
    private Double availableBalance;
    @JsonProperty("salaryParking")
    private Boolean salaryParking;
    @JsonProperty("newsletter")
    private Boolean newsletter;
    @JsonProperty("country")
    private Object country;
    @JsonProperty("state")
    private Object state;
    @JsonProperty("address1")
    private Object address1;
    @JsonProperty("address2")
    private Object address2;
    @JsonProperty("zipCode")
    private Object zipCode;
    @JsonProperty("citySuburb")
    private Object citySuburb;
    @JsonProperty("encodedPublicKey")
    private String encodedPublicKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Customer() {
    }

    /**
     *
     * @param newsletter
     * @param state
     * @param familyName
     * @param address1
     * @param address2
     * @param givenName
     * @param availableBalance
     * @param fundingSources
     * @param country
     * @param version
     * @param id
     * @param encodedPublicKey
     * @param pushId
     * @param citySuburb
     * @param email
     * @param deviceType
     * @param zipCode
     * @param salaryParking
     * @param vehicles
     * @param user
     * @param mobile
     */
    public Customer(Integer id, Integer version, String email, String givenName, Object pushId, Object deviceType, String familyName, String mobile, User user, List<Vehicle> vehicles, List<FundingSource> fundingSources, Double availableBalance, Boolean salaryParking, Boolean newsletter, Object country, Object state, Object address1, Object address2, Object zipCode, Object citySuburb, String encodedPublicKey) {
        super();
        this.id = id;
        this.version = version;
        this.email = email;
        this.givenName = givenName;
        this.pushId = pushId;
        this.deviceType = deviceType;
        this.familyName = familyName;
        this.mobile = mobile;
        this.user = user;
        this.vehicles = vehicles;
        this.fundingSources = fundingSources;
        this.availableBalance = availableBalance;
        this.salaryParking = salaryParking;
        this.newsletter = newsletter;
        this.country = country;
        this.state = state;
        this.address1 = address1;
        this.address2 = address2;
        this.zipCode = zipCode;
        this.citySuburb = citySuburb;
        this.encodedPublicKey = encodedPublicKey;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("pushId")
    public Object getPushId() {
        return pushId;
    }

    @JsonProperty("pushId")
    public void setPushId(Object pushId) {
        this.pushId = pushId;
    }

    @JsonProperty("deviceType")
    public Object getDeviceType() {
        return deviceType;
    }

    @JsonProperty("deviceType")
    public void setDeviceType(Object deviceType) {
        this.deviceType = deviceType;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("vehicles")
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("fundingSources")
    public List<FundingSource> getFundingSources() {
        return fundingSources;
    }

    @JsonProperty("fundingSources")
    public void setFundingSources(List<FundingSource> fundingSources) {
        this.fundingSources = fundingSources;
    }

    @JsonProperty("availableBalance")
    public Double getAvailableBalance() {
        return availableBalance;
    }

    @JsonProperty("availableBalance")
    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @JsonProperty("salaryParking")
    public Boolean getSalaryParking() {
        return salaryParking;
    }

    @JsonProperty("salaryParking")
    public void setSalaryParking(Boolean salaryParking) {
        this.salaryParking = salaryParking;
    }

    @JsonProperty("newsletter")
    public Boolean getNewsletter() {
        return newsletter;
    }

    @JsonProperty("newsletter")
    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("address1")
    public Object getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(Object address1) {
        this.address1 = address1;
    }

    @JsonProperty("address2")
    public Object getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    @JsonProperty("zipCode")
    public Object getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("citySuburb")
    public Object getCitySuburb() {
        return citySuburb;
    }

    @JsonProperty("citySuburb")
    public void setCitySuburb(Object citySuburb) {
        this.citySuburb = citySuburb;
    }

    @JsonProperty("encodedPublicKey")
    public String getEncodedPublicKey() {
        return encodedPublicKey;
    }

    @JsonProperty("encodedPublicKey")
    public void setEncodedPublicKey(String encodedPublicKey) {
        this.encodedPublicKey = encodedPublicKey;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
