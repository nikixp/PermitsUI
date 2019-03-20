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
        "customer",
        "tickets"
})
public class CustomerAuthority {

    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("tickets")
    private List<Object> tickets = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CustomerAuthority() {
    }

    /**
     *
     * @param customer
     * @param tickets
     */
    public CustomerAuthority(Customer customer, List<Object> tickets) {
        super();
        this.customer = customer;
        this.tickets = tickets;
    }

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("tickets")
    public List<Object> getTickets() {
        return tickets;
    }

    @JsonProperty("tickets")
    public void setTickets(List<Object> tickets) {
        this.tickets = tickets;
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
