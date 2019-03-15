package au.com.cdsw.permitsUI;

import org.apache.http.HttpHeaders;
import org.junit.Test;
import org.springframework.web.reactive.function.client.WebClient;

public class PermitsUiAppTest {

    @Test
    public void contextLoads() {

		WebClient webClient = WebClient.builder()
				.baseUrl("https://api.github.com")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/vnd.github.v3+json")
				.defaultHeader(HttpHeaders.USER_AGENT, "Spring 5 WebClient")
				.build();


	}

}
