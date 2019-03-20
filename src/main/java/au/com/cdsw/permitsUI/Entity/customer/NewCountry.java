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
        "countryName",
        "currencyCode",
        "countryCode",
        "isocode"
})
public class NewCountry {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("countryCode")
    private Integer countryCode;
    @JsonProperty("isocode")
    private String isocode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public NewCountry() {
    }

    /**
     *
     * @param id
     * @param countryName
     * @param currencyCode
     * @param countryCode
     * @param isocode
     * @param version
     */
    public NewCountry(Integer id, Integer version, String countryName, String currencyCode, Integer countryCode, String isocode) {
        super();
        this.id = id;
        this.version = version;
        this.countryName = countryName;
        this.currencyCode = currencyCode;
        this.countryCode = countryCode;
        this.isocode = isocode;
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

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("countryCode")
    public Integer getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("isocode")
    public String getIsocode() {
        return isocode;
    }

    @JsonProperty("isocode")
    public void setIsocode(String isocode) {
        this.isocode = isocode;
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
