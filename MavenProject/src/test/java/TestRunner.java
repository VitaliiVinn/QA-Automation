import com.hilel.core.driver.WebDriverFactory;
import com.hilel.core.util.ConfigProvider;
import org.openqa.selenium.WebDriver;


public class TestRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\My documents\\Testing work\\chromedriver.exe");
        System.setProperty("webdriver.opera.driver","F:\\My documents\\Testing work\\operadriver.exe");
        System.setProperty("webdriver.edge.driver","F:\\My documents\\Testing work\\msedgedriver.exe");
        System.setProperty("webdriver.ie.driver","F:\\My documents\\Testing work\\IEDriverServer.exe");
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);
        driver.quit();
    }
}
