package pl.elbarmaki.ecommerce.sales;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SalesHTTPTest {

    @Autowired
    TestRestTemplate http;

    @LocalServerPort
    int port;


    @Test
    void itShowsCurrrentOfferToCustomer(){
        var url = String.format("http://localhost:%s/api/current-offer", port);

        ResponseEntity<String> response = http.getForEntity(url, String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
