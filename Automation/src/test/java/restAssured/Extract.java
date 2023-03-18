package restAssured;

import com.hillel.util.core.ConfigProvider;
import io.cucumber.java.BeforeAll;
//import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Extract {
    private static String jsonResponse;

    @BeforeAll
    public static void initialize() {
        baseURI = ConfigProvider.BASE_URL;
        basePath = ConfigProvider.PATH;
        port = Integer.parseInt(ConfigProvider.PORT);
        jsonResponse = given().when().get("/1").asString();
        jsonResponse = given().when().get("list").asString();

    }
    @Test
    public void getName(){
        String name = JsonPath.read(jsonResponse, "$.firstName");
        System.out.println(name);
    }
    @Test
    public void getAllStudents(){
        List<HashMap<String, ?>> list = JsonPath.read(jsonResponse, "$");
        list.stream().forEach(System.out::println);
    }
    @Test
    public void getFirstStudent(){
        Map<String, Object> firstStudent = JsonPath.read(jsonResponse, "$.id[1]");
        System.out.println(firstStudent);
    }
    @Test
    public void getSecondStudent(){
        Map<String, Object> secondStudent = JsonPath.read(jsonResponse, "$.id[-1]");
        System.out.println(secondStudent);
    }
}
