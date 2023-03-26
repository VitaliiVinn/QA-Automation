package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;



public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void configuration(){
//        Configuration.browser = "edge";
//        System.out.println("Before method");
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.screenshots = true;
        Configuration.pageLoadTimeout = 20000;
    }
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        Selenide.open("https://www.saucedemo.com");
    }
//    @AfterMethod(alwaysRun = true)
//    public void cleanWebDriver(){
//        Selenide.clearBrowserCookies();
//        Selenide.refresh();
//        Selenide.open("about:blank");
//    }
//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
////        Selenide.closeWebDriver();
////        Selenide.back();
//    }
}
