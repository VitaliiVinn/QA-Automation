package junit;

import com.hillel.core.driver.WebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver = WebDriverFactory.getDriver();


//    @BeforeTest
//    public void beforeClass() {
//        driver = WebDriverFactory.getDriver();
//        driver.manage().window().maximize();
//    }
    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
