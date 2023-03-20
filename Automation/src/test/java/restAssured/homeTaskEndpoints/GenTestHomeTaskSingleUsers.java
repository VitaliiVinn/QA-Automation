package restAssured.homeTaskEndpoints;

import com.hillel.util.core.ConfigProvider;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import restAssured.BaseTestApi;

import static io.restassured.RestAssured.given;

public class GenTestHomeTaskSingleUsers {
    @Test
    public void getSingleUser() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users/2");
        response.prettyPrint();

    }
    @Test
    public void getListUsers() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users?page=2");
        response.prettyPrint();

    }
    @Test
    public void getListAnotherUsers() {
        given()
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
                .statusCode(404);
    }
}
