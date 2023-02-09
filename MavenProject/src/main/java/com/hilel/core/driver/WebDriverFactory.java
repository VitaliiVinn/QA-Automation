package com.hilel.core.driver;

import com.hilel.core.Browsers;
import com.hilel.core.util.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    private static final String BROWSER = System.getProperty("browser");
    public static WebDriver getDriver() {
        String browser_type = BROWSER != null ? BROWSER : ConfigProvider.BROWSER;
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
        return new ChromeDriver();
    }
    private static WebDriver getOperaDriver(){
        return new OperaDriver();
    }
    private static WebDriver getEdgeDriver(){
        return new EdgeDriver();
    }
    private static WebDriver getInternetExplorerDriver(){
        return new InternetExplorerDriver();
    }


}
