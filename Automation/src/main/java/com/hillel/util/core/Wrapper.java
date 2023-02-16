package com.hillel.util.core;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
    private Wrapper(){}
//click() (почекати перед кліком)
    public static void clickSleep(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='course-bar_body'])[3]")));
    }
    //•click() (клікнути на home page logo, і перевірити, що элемент зник)
    public static void clickHomePageLogo(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='site-logo-link']")));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    //•isClickable()
    public static void isClickable(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
