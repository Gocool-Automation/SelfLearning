package APITraining;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class getUsersTest {

    @Test
    public void testGetUsers() {
        RestAssured.baseURI = "https://reqres.in";

        given()
                .log().all()
                .when()
                .get("/api/users?page=2")
                .then()
                .log().all()
                .statusCode(200)
                .body("data[0].id", equalTo(7));
    }
}
