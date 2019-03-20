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
        "email",
        "password",
        "givenName",
        "familyName",
        "adminPushId",
        "eventPushId",
        "admin",
        "reporting",
        "enforcement",
        "sysAdmin",
        "supervisor",
        "attendant",
        "appUser",
        "active",
        "passwordChangeRequired",
        "permitManagement",
        "userProfile",
        "encodedPublicKey",
        "organisationId"
})
public class User {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("adminPushId")
    private Object adminPushId;
    @JsonProperty("eventPushId")
    private Object eventPushId;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("reporting")
    private Boolean reporting;
    @JsonProperty("enforcement")
    private Boolean enforcement;
    @JsonProperty("sysAdmin")
    private Boolean sysAdmin;
    @JsonProperty("supervisor")
    private Object supervisor;
    @JsonProperty("attendant")
    private Object attendant;
    @JsonProperty("appUser")
    private Boolean appUser;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("passwordChangeRequired")
    private Object passwordChangeRequired;
    @JsonProperty("permitManagement")
    private Boolean permitManagement;
    @JsonProperty("userProfile")
    private Object userProfile;
    @JsonProperty("encodedPublicKey")
    private String encodedPublicKey;
    @JsonProperty("organisationId")
    private Integer organisationId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param userProfile
     * @param enforcement
     * @param permitManagement
     * @param attendant
     * @param eventPushId
     * @param familyName
     * @param organisationId
     * @param givenName
     * @param password
     * @param adminPushId
     * @param version
     * @param id
     * @param appUser
     * @param encodedPublicKey
     * @param supervisor
     * @param email
     * @param admin
     * @param active
     * @param reporting
     * @param passwordChangeRequired
     * @param sysAdmin
     */
    public User(Integer id, Integer version, String email, String password, String givenName, String familyName, Object adminPushId, Object eventPushId, Boolean admin, Boolean reporting, Boolean enforcement, Boolean sysAdmin, Object supervisor, Object attendant, Boolean appUser, Boolean active, Object passwordChangeRequired, Boolean permitManagement, Object userProfile, String encodedPublicKey, Integer organisationId) {
        super();
        this.id = id;
        this.version = version;
        this.email = email;
        this.password = password;
        this.givenName = givenName;
        this.familyName = familyName;
        this.adminPushId = adminPushId;
        this.eventPushId = eventPushId;
        this.admin = admin;
        this.reporting = reporting;
        this.enforcement = enforcement;
        this.sysAdmin = sysAdmin;
        this.supervisor = supervisor;
        this.attendant = attendant;
        this.appUser = appUser;
        this.active = active;
        this.passwordChangeRequired = passwordChangeRequired;
        this.permitManagement = permitManagement;
        this.userProfile = userProfile;
        this.encodedPublicKey = encodedPublicKey;
        this.organisationId = organisationId;
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

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("adminPushId")
    public Object getAdminPushId() {
        return adminPushId;
    }

    @JsonProperty("adminPushId")
    public void setAdminPushId(Object adminPushId) {
        this.adminPushId = adminPushId;
    }

    @JsonProperty("eventPushId")
    public Object getEventPushId() {
        return eventPushId;
    }

    @JsonProperty("eventPushId")
    public void setEventPushId(Object eventPushId) {
        this.eventPushId = eventPushId;
    }

    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @JsonProperty("reporting")
    public Boolean getReporting() {
        return reporting;
    }

    @JsonProperty("reporting")
    public void setReporting(Boolean reporting) {
        this.reporting = reporting;
    }

    @JsonProperty("enforcement")
    public Boolean getEnforcement() {
        return enforcement;
    }

    @JsonProperty("enforcement")
    public void setEnforcement(Boolean enforcement) {
        this.enforcement = enforcement;
    }

    @JsonProperty("sysAdmin")
    public Boolean getSysAdmin() {
        return sysAdmin;
    }

    @JsonProperty("sysAdmin")
    public void setSysAdmin(Boolean sysAdmin) {
        this.sysAdmin = sysAdmin;
    }

    @JsonProperty("supervisor")
    public Object getSupervisor() {
        return supervisor;
    }

    @JsonProperty("supervisor")
    public void setSupervisor(Object supervisor) {
        this.supervisor = supervisor;
    }

    @JsonProperty("attendant")
    public Object getAttendant() {
        return attendant;
    }

    @JsonProperty("attendant")
    public void setAttendant(Object attendant) {
        this.attendant = attendant;
    }

    @JsonProperty("appUser")
    public Boolean getAppUser() {
        return appUser;
    }

    @JsonProperty("appUser")
    public void setAppUser(Boolean appUser) {
        this.appUser = appUser;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("passwordChangeRequired")
    public Object getPasswordChangeRequired() {
        return passwordChangeRequired;
    }

    @JsonProperty("passwordChangeRequired")
    public void setPasswordChangeRequired(Object passwordChangeRequired) {
        this.passwordChangeRequired = passwordChangeRequired;
    }

    @JsonProperty("permitManagement")
    public Boolean getPermitManagement() {
        return permitManagement;
    }

    @JsonProperty("permitManagement")
    public void setPermitManagement(Boolean permitManagement) {
        this.permitManagement = permitManagement;
    }

    @JsonProperty("userProfile")
    public Object getUserProfile() {
        return userProfile;
    }

    @JsonProperty("userProfile")
    public void setUserProfile(Object userProfile) {
        this.userProfile = userProfile;
    }

    @JsonProperty("encodedPublicKey")
    public String getEncodedPublicKey() {
        return encodedPublicKey;
    }

    @JsonProperty("encodedPublicKey")
    public void setEncodedPublicKey(String encodedPublicKey) {
        this.encodedPublicKey = encodedPublicKey;
    }

    @JsonProperty("organisationId")
    public Integer getOrganisationId() {
        return organisationId;
    }

    @JsonProperty("organisationId")
    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
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
