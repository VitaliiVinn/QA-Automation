package restAssured.homeTaskEndpoints;

import com.hillel.api.CreateUserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import restAssured.BaseTestApi;

import static io.restassured.RestAssured.given;

public class PutTestHomeTask extends BaseTestApi {
    @Test
    public void putUser(){
        CreateUserPojo createUserPojo = new CreateUserPojo("morpheus", "zion resident");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(createUserPojo)
                        .when()
                        .put("https://reqres.in/api/users/2")
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .response();
        Assert.assertEquals(200, response.statusCode());

    }
}
