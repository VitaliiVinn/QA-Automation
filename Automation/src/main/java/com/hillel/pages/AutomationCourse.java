package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsVisible;

public class AutomationCourse extends BasePage{
    private By title = By.xpath("//span[@class='course-descriptor_header-text']");
    private By rank = By.xpath("//div[@class='course-rating']");
    public AutomationCourse(WebDriver driver) {
        super(driver);
    }
    @Override
    public void pageOpen() {
        super.driver.get(ConfigProvider.BASE_URL);
        ensureOpened();
    }
    @Override
    public void ensureOpened() {
        WebElement logo = super.driver.findElement(title);
        WebElement logo1 = super.driver.findElement(rank);
        waitElementsUntilIsVisible(super.driver, logo);
    }
    public String getTitle() {
        return driver.findElement(title).getText();
    }
    public String getRank() {
        return driver.findElement(rank).getText();
    }
}
