//package au.com.cdsw.permitsUI;
//
//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.exceptions.UnirestException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static junit.framework.TestCase.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
////@RunWith(SpringRunner.class)
////@SpringBootTest
//public class PermitsUiApplicationTests {
//
//	@Test
//	public void contextLoads() {
//
//		Map<String, String> headers = new HashMap<>();
//		headers.put("accept", "application/json");
//		headers.put("Authorization", "Bearer 5a9ce37b3100004f00ab5154");
//
//		Map<String, Object> fields = new HashMap<>();
//		fields.put("name", "Sam Baeldung");
//		fields.put("id", "PSP123");
//
//		try {
//			HttpResponse<JsonNode> jsonResponse
//					= Unirest.put("http://www.mocky.io/v2/5a9ce7853100002a00ab515e")
//					.headers(headers).fields(fields)
//					.asJson();
//
//			assertNotNull(jsonResponse.getBody());
//			assertEquals(202, jsonResponse.getStatus());
//		}
//		catch (UnirestException e){
//			e.printStackTrace();
//		}
//
//
//	}
//
//}
