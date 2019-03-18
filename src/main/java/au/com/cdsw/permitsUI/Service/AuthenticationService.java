package au.com.cdsw.permitsUI.Service;

import au.com.cdsw.permitsUI.Entity.Customer;
import au.com.cdsw.permitsUI.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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

//    private AuthService authService;
//
//    @Autowired
//    public void setAuthService(AuthService authService){
//        this.authService = authService;
//    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        final String baseUri = "http://admin.parki.com.au/api/customer/authenticate";
        User user = new User(username, password);
        try {
            URI uri = new URI(baseUri);
            ResponseEntity<User> result = new RestTemplate().postForEntity(uri, user, User.class);
            User response = result.getBody();

            throw new URISyntaxException(username, password);
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
