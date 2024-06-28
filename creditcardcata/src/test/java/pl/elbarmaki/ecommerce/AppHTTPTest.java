package pl.elbarmaki.ecommerce;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class AppHTTPTest {

    @LocalServerPort
    private Integer port;

    @Autowired
    TestRestTemplate http;

    @Test
    void itLoadsEcommerceHomePage(){
        //Arrage
        var url = String.format("http://localhost:%s", port);
        //url + browser
        //Act
        ResponseEntity<String> response = http.getForEntity(url, String.class);
        //open url, check status, read body

        //Assertion
        assertEquals(HttpStatus.OK, response.getStatusCode());

        // if body contains shooop it
        // if http status -> OK 200


    }
}
