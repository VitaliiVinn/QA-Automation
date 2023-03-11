package com.hillel.util.core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public final class WebDriverUtils {
    private  WebDriverUtils(){

    }
    public static File getScreenShot(WebDriver driver){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        return takesScreenshot.getScreenshotAs(OutputType.FILE);
    }
}
