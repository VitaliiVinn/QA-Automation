package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetMethodTest extends BaseTestApi {
    @Test
    public void getAllStudentsTest(){
        Response response = RestAssured
                .given()
//                .queryParam("")
                .when()
                .get("http://localhost:8080/student/list");
             response.prettyPrint();
    }
}
