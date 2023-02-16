import com.hillel.core.driver.WebDriverFactory;
import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hillel.util.core.Wrapper.*;

public class TestRunner {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);
        WebElement buttonCourses = driver.findElement(By.xpath("(//div[@class='course-bar_body'])[3]"));
//        waitElementsUntilIsClickable(driver, buttonCourses);
//        waitElementsUntilIsVisible(driver, buttonCourses);
        clickSleep(driver, buttonCourses);
        clickHomePageLogo(driver, buttonCourses);
        isClickable(driver, buttonCourses);
        buttonCourses.click();
        driver.quit();
    }
}
