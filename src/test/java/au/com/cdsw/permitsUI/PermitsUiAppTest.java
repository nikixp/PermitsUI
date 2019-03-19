package au.com.cdsw.permitsUI;

import au.com.cdsw.permitsUI.Entity.Customer;
import au.com.cdsw.permitsUI.Entity.Permits;
import au.com.cdsw.permitsUI.Entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


public class PermitsUiAppTest {

//    @Test
//    public void shortensLink(){
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        final String baseUri = "http://admin.parki.com.au/api/customer/authenticate";
//
//        try {
//            URI uri = new URI(baseUri);
//
//            User user = new User("adamo@cdsw.com.au", "test");
//
//            ResponseEntity<Customer> result = restTemplate.postForEntity(uri, user, Customer.class);
//            System.out.println("result is : " + result);
//            Assert.assertEquals(200, result.getStatusCodeValue());
//
//        } catch (URISyntaxException e){
//            System.out.println(e);
//        }

        @Test
        public void shortensLinks(){

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List<Permits>> response = restTemplate.exchange(
                    "http://localhost:1010/api/permits/501", HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Permits>>(){});

            List<Permits> customers = response.getBody();
            System.out.println(customers);

    }





}
