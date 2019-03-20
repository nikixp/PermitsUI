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
        "@class",
        "id",
        "version",
        "primary",
        "archived",
        "cardType",
        "obfuscatedCardNumber",
        "merchantId",
        "expiryDate"
})
public class FundingSource {

    @JsonProperty("@class")
    private String _class;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("cardType")
    private String cardType;
    @JsonProperty("obfuscatedCardNumber")
    private String obfuscatedCardNumber;
    @JsonProperty("merchantId")
    private String merchantId;
    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public FundingSource() {
    }

    /**
     *
     * @param obfuscatedCardNumber
     * @param id
     * @param _class
     * @param archived
     * @param expiryDate
     * @param primary
     * @param merchantId
     * @param cardType
     * @param version
     */
    public FundingSource(String _class, Integer id, Integer version, Boolean primary, Boolean archived, String cardType, String obfuscatedCardNumber, String merchantId, String expiryDate) {
        super();
        this._class = _class;
        this.id = id;
        this.version = version;
        this.primary = primary;
        this.archived = archived;
        this.cardType = cardType;
        this.obfuscatedCardNumber = obfuscatedCardNumber;
        this.merchantId = merchantId;
        this.expiryDate = expiryDate;
    }

    @JsonProperty("@class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("@class")
    public void setClass_(String _class) {
        this._class = _class;
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

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("cardType")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("obfuscatedCardNumber")
    public String getObfuscatedCardNumber() {
        return obfuscatedCardNumber;
    }

    @JsonProperty("obfuscatedCardNumber")
    public void setObfuscatedCardNumber(String obfuscatedCardNumber) {
        this.obfuscatedCardNumber = obfuscatedCardNumber;
    }

    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
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
