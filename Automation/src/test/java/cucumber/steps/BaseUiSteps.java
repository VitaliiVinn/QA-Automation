package cucumber.steps;

import com.hillel.core.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseUiSteps {
    protected final WebDriver driver = WebDriverFactory.getDriver();

}
