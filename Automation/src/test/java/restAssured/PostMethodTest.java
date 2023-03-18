package restAssured;

import com.hillel.api.StudentPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PostMethodTest extends BaseTestApi {
    @Test
    public void createStudent() {
        String student = "{\"firstName\":}";
        List<String> courses = new ArrayList<>();
        courses.add("JAVA");
        courses.add("C++");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Borys");
        studentPojo.setLastName("Eltsin");
        studentPojo.setEmail("vinvit@ukr.net");
        studentPojo.setProgram("CS");
        studentPojo.setCourses(courses);
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(studentPojo)
                .post()
                .then()
                .statusCode(201);
    }
}
