package junit;

import com.hillel.core.driver.WebDriverFactory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;

    @Before
    public static void beforeClass(){
        driver = WebDriverFactory.getDriver();
    }

    @After
    public static void afterClass(){

    }
}
