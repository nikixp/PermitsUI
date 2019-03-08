package au.com.cdsw.permitsUI;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

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

		try {
			HttpResponse<JsonNode> jsonResponse
					= Unirest.post("http://admin.parki.com.au/api/customer/authenticate")
					.body("{\"username\":\"adamo@cdsw.com.au\", \"password\":\"test\"}")
					.asJson();

		}
		catch (UnirestException e){
			e.printStackTrace();
		}


    }

}
