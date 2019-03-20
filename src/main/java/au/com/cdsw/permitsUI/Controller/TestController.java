package au.com.cdsw.permitsUI.Controller;

import au.com.cdsw.permitsUI.Service.CustomerGrantAuthority;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TestController {

    @GetMapping(value = "/auth")
    public ResponseEntity getAuth() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        CustomerGrantAuthority customer = (CustomerGrantAuthority) authorities.stream().findFirst().orElse(null);
        return customer != null ? ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(customer.getAuthority()) : ResponseEntity.notFound().build();
    }

}
