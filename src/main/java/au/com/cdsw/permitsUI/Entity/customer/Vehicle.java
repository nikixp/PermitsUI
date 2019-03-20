package au.com.cdsw.permitsUI.Entity.customer;

import java.util.HashMap;
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
        "registration",
        "state",
        "country",
        "newCountry",
        "newState",
        "archived",
        "active",
        "deleted",
        "vehicleType",
        "lastUpdateDate"
})
public class Vehicle {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("registration")
    private String registration;
    @JsonProperty("state")
    private Object state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("newCountry")
    private NewCountry newCountry;
    @JsonProperty("newState")
    private Object newState;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("vehicleType")
    private Object vehicleType;
    @JsonProperty("lastUpdateDate")
    private Object lastUpdateDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Vehicle() {
    }

    /**
     * @param id
     * @param archived
     * @param state
     * @param vehicleType
     * @param active
     * @param newState
     * @param registration
     * @param deleted
     * @param lastUpdateDate
     * @param newCountry
     * @param country
     * @param version
     */
    public Vehicle(Integer id, Integer version, String registration, Object state, String country, NewCountry newCountry, Object newState, Boolean archived, Boolean active, Boolean deleted, Object vehicleType, Object lastUpdateDate) {
        super();
        this.id = id;
        this.version = version;
        this.registration = registration;
        this.state = state;
        this.country = country;
        this.newCountry = newCountry;
        this.newState = newState;
        this.archived = archived;
        this.active = active;
        this.deleted = deleted;
        this.vehicleType = vehicleType;
        this.lastUpdateDate = lastUpdateDate;
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

    @JsonProperty("registration")
    public String getRegistration() {
        return registration;
    }

    @JsonProperty("registration")
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("newCountry")
    public NewCountry getNewCountry() {
        return newCountry;
    }

    @JsonProperty("newCountry")
    public void setNewCountry(NewCountry newCountry) {
        this.newCountry = newCountry;
    }

    @JsonProperty("newState")
    public Object getNewState() {
        return newState;
    }

    @JsonProperty("newState")
    public void setNewState(Object newState) {
        this.newState = newState;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("vehicleType")
    public Object getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("vehicleType")
    public void setVehicleType(Object vehicleType) {
        this.vehicleType = vehicleType;
    }

    @JsonProperty("lastUpdateDate")
    public Object getLastUpdateDate() {
        return lastUpdateDate;
    }

    @JsonProperty("lastUpdateDate")
    public void setLastUpdateDate(Object lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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
