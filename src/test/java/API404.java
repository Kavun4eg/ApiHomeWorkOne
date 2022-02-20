import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API404 {
    private final static String URL = "https://reqres.in/";
    private final int EXPECTED_Response = 404;

    @Test
    public void checkStatusResponseCode() {
        int actualStatusCode = given()
                .when()
                .get(URL + "/api/users/23")
                .getStatusCode();
        Assert.assertEquals(actualStatusCode, EXPECTED_Response);
    }
}
