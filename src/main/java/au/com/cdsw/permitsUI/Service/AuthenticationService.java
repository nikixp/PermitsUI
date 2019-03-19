package au.com.cdsw.permitsUI.Service;

import au.com.cdsw.permitsUI.Entity.Customer;
import au.com.cdsw.permitsUI.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService implements AuthenticationProvider {

    @Autowired
    private AuthService authService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        RestTemplate restTemplate = new RestTemplate();

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        final String baseUri = "http://admin.parki.com.au/api/customer/authenticate";

        User user = new User(username, password);
        try {
            URI uri = new URI(baseUri);

            ResponseEntity<Customer> result = new RestTemplate().postForEntity(uri, user, Customer.class);

//            ResponseEntity<List<Customer>> response = restTemplate.exchange(
//                    baseUri, HttpMethod.GET,
//                    null,
//                    new ParameterizedTypeReference<List<Customer>>(){});
//
//            List<Customer> customers = response.getBody();
//
//            System.out.println(customers);
            throw new URISyntaxException("", "");
        }
        catch (URISyntaxException e){
            System.out.println(e);
        }

        if(user != null){
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            //here I need to store my customer object to use it while the user is logged in

            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities);
        }
        throw new AuthenticationServiceException("Invalid Credential");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
