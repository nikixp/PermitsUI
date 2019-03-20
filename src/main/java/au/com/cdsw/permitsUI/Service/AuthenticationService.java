package au.com.cdsw.permitsUI.Service;

import au.com.cdsw.permitsUI.Entity.Customer;
import au.com.cdsw.permitsUI.Entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

//        RestTemplate restTemplate = new RestTemplate();
//
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        final String baseUri = "http://admin.parki.com.au/api/customer/authenticate";
//
//        User user = new User(username, password);
//        try {
//            URI uri = new URI(baseUri);
//
//            ResponseEntity<Customer> result = new RestTemplate().postForEntity(uri, user, Customer.class);
//
//            throw new URISyntaxException("", "");
//        }
//        catch (URISyntaxException e){
//            System.out.println(e);
//        }
//
//        if(user != null){
//            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//            //here I need to store my customer object to use it while the user is logged in
//
//            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//            return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities);
//        }
//        throw new AuthenticationServiceException("Invalid Credential");


        /*Please use email:  adamo@cdsw.com.au   password:  test*/
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        User user = new User(username, password);
        Customer customer = new RestTemplate().postForObject("http://admin.parki.com.au/api/customer/authenticate", user, Customer.class);


        if (customer != null) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            try {
                grantedAuthorities.add(new CustomerGrantAuthority(new ObjectMapper().writeValueAsString(customer)));
                System.out.println(customer.getFamilyName());
            }catch (JsonProcessingException e){
                System.out.println(e);
            }
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities);
        }
        throw new AuthenticationServiceException("Invalid credentials.");

    }

    public MultiValueMap<String, String> createRequest(String username, String password) {
        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
        request.add("username", username);
        request.add("password", password);
        return request;
    }


    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
