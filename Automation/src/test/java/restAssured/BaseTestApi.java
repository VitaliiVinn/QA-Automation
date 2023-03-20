package restAssured;

import com.hillel.util.core.ConfigProvider;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;

public class BaseTestApi {
    @BeforeAll
    public static void initialize(){
        RestAssured.baseURI = ConfigProvider.BASE_API_URL;
        RestAssured.basePath = ConfigProvider.PATH;
        RestAssured.port = Integer.parseInt(ConfigProvider.PORT);

    }
}
