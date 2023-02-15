package com.hillel.util.core;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private WaitUtils(){
    }
    public static void waitElementsUntilIsClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitElementsUntilIsVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
