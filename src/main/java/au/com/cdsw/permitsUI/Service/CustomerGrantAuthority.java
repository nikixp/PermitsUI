package au.com.cdsw.permitsUI.Service;

import au.com.cdsw.permitsUI.Entity.customer.CustomerAuthority;
import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class CustomerGrantAuthority implements GrantedAuthority {

    private String customerEmail;
    private CustomerAuthority customerAuthority;

    public CustomerGrantAuthority(@NotNull CustomerAuthority customerAuthority){
        this.customerAuthority = customerAuthority;
        this.customerEmail = customerAuthority.getCustomer().getEmail();
    }

    public CustomerAuthority getCustomerAuthority() {
        return customerAuthority;
    }

    @Override
    public String getAuthority() {
        return customerEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerGrantAuthority that = (CustomerGrantAuthority) o;
        return Objects.equals(customerEmail, that.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmail);
    }

}
