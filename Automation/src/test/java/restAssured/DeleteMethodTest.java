package restAssured;

import com.hillel.api.StudentPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DeleteMethodTest extends BaseTestApi{
    @Test
    public void deleteStudent() {
                RestAssured
                .given()
                .when()
                .delete("/1")
                .then()
                .statusCode(204);
    }
}
