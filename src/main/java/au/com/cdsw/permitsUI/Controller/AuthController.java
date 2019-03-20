package au.com.cdsw.permitsUI.Controller;

import au.com.cdsw.permitsUI.Entity.customer.CustomerAuthority;
import au.com.cdsw.permitsUI.Service.CustomerGrantAuthority;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AuthController {

    private static CustomerAuthority unauthorizedCustomer = new CustomerAuthority();

    @GetMapping(value = "/auth")
    public ResponseEntity getAuth() {
        CustomerAuthority customerAuthority = getCustomerAuthority();
        return customerAuthority != null
                ? ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(customerAuthority)
                : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(unauthorizedCustomer);
    }

    public CustomerAuthority getCustomerAuthority() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority auth : authorities) {
            if (auth instanceof CustomerGrantAuthority) {
                return ((CustomerGrantAuthority) auth).getCustomerAuthority();
            }
        }
        return null;
    }

}
