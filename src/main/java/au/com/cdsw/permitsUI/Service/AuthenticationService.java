package au.com.cdsw.permitsUI.Service;

import au.com.cdsw.permitsUI.Entity.User;
import au.com.cdsw.permitsUI.Entity.customer.CustomerAuthority;
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

        CustomerAuthority customer = null;
        try {
            customer = new RestTemplate().postForObject("http://admin.parki.com.au/api/customer/authenticate",
                    user, CustomerAuthority.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Customer customer = new RestTemplate().postForObject("http://admin.parki.com.au/api/customer/authenticate", user, Customer.class);

        try { //for test
            System.out.println("customer logged in " + new ObjectMapper().writeValueAsString(customer));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }// remove it for production ! :)

        if (customer != null) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new CustomerGrantAuthority(customer));
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities);
        }
        throw new AuthenticationServiceException("Invalid credentials.");

    }

//    public MultiValueMap<String, String> createRequest(String username, String password) {
//        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
//        request.add("username", username);
//        request.add("password", password);
//        return request;
//    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
