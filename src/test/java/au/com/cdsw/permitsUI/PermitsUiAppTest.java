package au.com.cdsw.permitsUI;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;


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
		//server is not able to process the Content-Type of the request,
		try {

			Unirest.post("http://admin.parki.com.au/api/customer/authenticate")
					.queryString("username", "adamo@cdsw.com.au")
					.field("username", "adamo@cdsw.com.au")
					.asJson();
//			HttpResponse<JsonNode> jsonResponse
//					= Unirest.post("http://admin.parki.com.au/api/customer/authenticate")
//					.body("{\"username\":\"adamo@cdsw.com.au\", \"password\":\"test\"}")
//					.asJson();
//			DataServiceVersion: 2.9;
		}
		catch (UnirestException e){
			e.printStackTrace();
		}


	}

}
