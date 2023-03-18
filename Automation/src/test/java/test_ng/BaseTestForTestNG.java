package test_ng;

import com.hillel.core.driver.WebDriverFactory;
import com.hillel.util.core.WebDriverUtils;
import io.qameta.allure.Allure;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
@Log4j2
public class BaseTestForTestNG {
    protected WebDriver driver = WebDriverFactory.getDriver();

    @BeforeTest
    public void beforeClass() {
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void takeScreenShot(ITestResult testResult) {
//        File screenShot = WebDriverUtils.getScreenShot(driver);
//        try {
//            Allure.addAttachment("screenshot", Files.newInputStream(screenShot.toPath()));
//        }
//        catch (IOException e){
//            log.error("We cannot take screenshot");
//        }
//    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
