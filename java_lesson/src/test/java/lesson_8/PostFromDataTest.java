package lesson_8;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostFromDataTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testPostFormData() {
        given()
            .baseUri(BASE_URL)
            .contentType("application/json")
            .body("{\"foo1\": \"bar1\", \"foo2\": \"bar2\"}")
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("json.foo1", equalTo("bar1"))
            .body("json.foo2", equalTo("bar2"));
    }
}
