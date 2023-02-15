import com.hilel.core.driver.WebDriverFactory;
import com.hilel.core.util.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hilel.core.util.WaitUtils.waitElementsUntilIsClickable;

public class TestRunner {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);
        WebElement buttonCourses = driver.findElement(By.xpath("(//div[@class='course-bar_body'])[3]"));
        waitElementsUntilIsClickable(driver, buttonCourses);
        buttonCourses.click();
//        driver.quit();
    }
}
