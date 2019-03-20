//package au.com.cdsw.permitsUI.Service;
//
//import au.com.cdsw.permitsUI.Entity.Customer;
//import au.com.cdsw.permitsUI.Entity.User;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestTemplate;
//
///*Create a client to consume login rest API*/
//
//@Service
//public class AuthService {
//
//    @Bean
//    public RestTemplate authRestTemplate(){
//        return new RestTemplateBuilder().rootUri("http://admin.parki.com.au/api/customer/authenticate").build();
//    }
//
//    public User authenticate(MultiValueMap<String, String> request){
//        return authRestTemplate().postForObject("/user", request, User.class);
//    }
//
//    public MultiValueMap<String, String> createRequest(String username, String password){
//        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
//        request.add("username", username);
//        request.add("password", password);
//
//        return request;
//    }
//
//}
