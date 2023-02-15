package com.hilel.core.driver;

import com.hilel.core.Browsers;
import com.hilel.core.util.ConfigProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    private static final String BROWSER = System.getProperty("browser");
    private static WebDriver driver;
    public static WebDriver getDriver() {
        String browser_type = BROWSER != null ? BROWSER : ConfigProvider.BROWSER;
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return getDriver(Browsers.valueOf(browser_type.toUpperCase()));
    }
    public static WebDriver getDriver(Browsers browsers) {
        switch (browsers) {
            case CHROME:
                return getChromeDriver();
            case OPERA:
                return getOperaDriver();
            case EDGE:
                return getEdgeDriver();
            case INTERNET_EXPLORER:
                return getInternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Wrong browser was chosen");
        }
    }
    private static WebDriver getChromeDriver() {
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
    private static WebDriver getOperaDriver(){
        if(driver == null) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        return driver;
    }
    private static WebDriver getEdgeDriver(){
        if(driver == null){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
    private static WebDriver getInternetExplorerDriver(){
        if(driver == null) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        return driver;
    }
}
