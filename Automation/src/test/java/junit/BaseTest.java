package junit;

import com.hillel.core.driver.WebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseTest {
    protected static WebDriver driver;

    @Before
    public void beforeClass() {
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
