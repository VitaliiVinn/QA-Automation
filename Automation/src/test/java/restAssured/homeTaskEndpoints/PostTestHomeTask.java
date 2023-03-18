package restAssured.homeTaskEndpoints;

import com.hillel.api.*;
import com.hillel.util.core.ConfigProvider;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import restAssured.BaseTestApi;

import static io.restassured.RestAssured.given;

public class PostTestHomeTask extends BaseTestApi {
    @Test
    public void createUser(){
        CreateUserPojo createUserPojo = new CreateUserPojo("morpheus", "leader");
        Response response =
                given()
                .contentType(ContentType.JSON)
                .body(createUserPojo)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .extract()
                .response();
        Assert.assertEquals(201, response.statusCode());
    }
    @Test
    public void registerUser(){
        RegisterUserPojo registerUserPojo = new RegisterUserPojo();
        registerUserPojo.setEmail("eve.holt@reqres.in");
        registerUserPojo.setPassword("pistol");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(registerUserPojo)
                        .when()
                        .post("https://reqres.in/api/register")
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .response();
        Assert.assertEquals(200, response.statusCode());
    }
    @Test
    public void registerUserUnsuccess(){
        RegisterUnsuccessPojo registerUnsuccessPojo = new RegisterUnsuccessPojo();
        registerUnsuccessPojo.setEmail("eve.holt@reqres.in");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(registerUnsuccessPojo)
                        .when()
                        .post("https://reqres.in/api/register")
                        .then()
                        .statusCode(HttpStatus.SC_BAD_REQUEST)
                        .extract()
                        .response();
        Assert.assertEquals(400, response.statusCode());
    }
    @Test
    public void loginUserSuccess(){
        LoginSuccessPojo loginSuccessPojo = new LoginSuccessPojo();
        loginSuccessPojo.setEmail("eve.holt@reqres.in");
        loginSuccessPojo.setPassword("cityslicka");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(loginSuccessPojo)
                        .when()
                        .post("https://reqres.in/api/login")
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .response();
        Assert.assertEquals(200, response.statusCode());
    }
    @Test
    public void loginUserUnsuccessful(){
        LoginUnsuccessfulPojo loginUnsuccessfulPojo = new LoginUnsuccessfulPojo();
        loginUnsuccessfulPojo.setEmail("peter@klaven");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(loginUnsuccessfulPojo)
                        .when()
                        .post("https://reqres.in/api/login")
                        .then()
                        .statusCode(HttpStatus.SC_BAD_REQUEST)
                        .extract()
                        .response();
        Assert.assertEquals(400, response.statusCode());
    }
}
