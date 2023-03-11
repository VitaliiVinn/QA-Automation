package test_ng;

import com.hillel.core.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTestForHomeTask {
    //Написати метод testStartedLog(Method method) (клас Method імпортувати з java.lang.reflect.Method;).
    //Повісити на нього аннотацію @BeforeMethod. Метод повинен писати в консоль лог рівня
    // INFO: "Test {METHOD_NAME} started" (METHOD_NAME - ім'я методу, що виконується, отримати з параметра method).
    //Написати метод testFinishedLog(ITestResult result) і повісити на нього анотацію @AfterMethod.
    // Метод повинен виводити в консоль лог рівня INFO: "Test {METHOD_NAME} finished with result {SUCCESS/FAIL}".
    // Інформацію про тест і його результат взяти з параметра result.
    //Розмістити обидва методи в базовому класі BaseTest.
    protected WebDriver driver = WebDriverFactory.getDriver();

    @BeforeMethod
    public void testStartedLog(Method method) {
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
//        Method[] methods = TestNg.class.getMethods();
        String.format("testNGtesting %s", method.getName());

    }
    @AfterMethod
    public void testFinishedLog(ITestResult result) {
        result = Reporter.getCurrentTestResult();
        driver.quit();

    }

}
