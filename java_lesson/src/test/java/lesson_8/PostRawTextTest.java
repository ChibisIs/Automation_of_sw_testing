package lesson_8;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostRawTextTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testPostRawText() {
        given()
            .baseUri(BASE_URL)
            .contentType("text/plain")
            .body("{\n    \"test\": \"value\"\n}")
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("data", equalTo("{\n    \"test\": \"value\"\n}"));
    }
}