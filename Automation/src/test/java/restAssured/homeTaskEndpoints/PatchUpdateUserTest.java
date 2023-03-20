package restAssured.homeTaskEndpoints;

import com.hillel.api.CreateUserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import restAssured.BaseTestApi;

import static io.restassured.RestAssured.given;

public class PatchUpdateUserTest extends BaseTestApi {
    @Test
    public void patchUser(){
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\",\n" +
                "    \"updatedAt\": \"2023-03-18T18:11:28.271Z\"\n" +
                "}";
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .when()
                        .patch("https://reqres.in/api/users/2")
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .response();
        Assert.assertEquals(200, response.statusCode());

    }
}
