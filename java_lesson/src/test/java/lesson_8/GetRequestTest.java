package lesson_8;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetRequestTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test 
    void testGetRequest() {
        given()
            .baseUri(BASE_URL)
            .queryParam("foo1", "bar1")
            .queryParam("foo2", "bar2")
        .when()
            .get("/get")
        .then()
            .statusCode(200)
            .body("args.foo1", equalTo("bar1"))
            .body("args.foo2", equalTo("bar2"));
    }
}