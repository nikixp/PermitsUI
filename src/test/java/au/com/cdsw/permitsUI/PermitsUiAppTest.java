package au.com.cdsw.permitsUI;

import au.com.cdsw.permitsUI.Entity.Customer;
import com.jayway.jsonpath.internal.filter.ValueNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


public class PermitsUiAppTest {

    @Test
    public void contextLoads() {

//		Map<String, String> headers = new HashMap<>();
//		headers.put("accept", "application/json");
//		headers.put("Authorization", "Basic YWRhbW9AY2Rzdy5jb20uYXU6dGVzdA==");
//
//		Map<String, Object> fields = new HashMap<>();
//		fields.put("username", "adamo@cdsw.com.au");
//		fields.put("password", "test");
//
//		try {
//			HttpResponse<JsonNode> jsonResponse
//					= Unirest.post("http://admin.parki.com.au/api/customer/authenticate")
//					.body("{\"username\":\"adamo@cdsw.com.au\", \"password\":\"test\"}")
//					.asJson();
//
//		}
//		catch (UnirestException e){
//			e.printStackTrace();
//		}

		ResponseEntity<Customer> responseEntity = new RestTemplate().getForEntity("https://admin.parki.com.au/api/customer/authenticate", Customer.class,"adamo@cdsw.com.au", "test");

		Customer response = responseEntity.getBody();
		System.out.println(response);
	}

}
