package lesson_8;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PatchRequestTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testPatchRequestText() {
        given()
            .baseUri(BASE_URL)
            .contentType("text/plain")
            .body("This is expected to be sent back as part of response body.")
        .when()
            .patch("/patch")
        .then()
            .statusCode(200)
            .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}
