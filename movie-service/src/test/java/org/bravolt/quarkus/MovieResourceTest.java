package org.bravolt.quarkus;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@Disabled
public class MovieResourceTest {

/**
 * TODO: Add unit testing later. For now we're just focusing on
 * demonstrating high level of Quarkus:
 * 
 * -Running app in dev mode
 * -Packaging the application as a native Kubernetes app
 * -Comparing startup and request times
 */
	
    @Test
    public void testHelloEndpoint() {
        given()
        	.when().get("/movies")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }
}