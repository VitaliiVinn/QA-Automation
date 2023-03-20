package restAssured.homeTaskEndpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import restAssured.BaseTestApi;

import static io.restassured.RestAssured.given;

public class DeleteTestHomeTask extends BaseTestApi {
    @Test
    public void deleteUser() {
        Response response =
                given()
                        .when()
                        .delete("https://reqres.in/api/users/2")
                        .then()
                        .statusCode(HttpStatus.SC_NO_CONTENT)
                        .extract()
                        .response();
        Assert.assertEquals(204, response.statusCode());

    }
}
