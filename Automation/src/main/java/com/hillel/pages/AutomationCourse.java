package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsVisible;

public class AutomationCourse extends BasePage{

    public String title = "//span[@class='course-descriptor_header-text']";
    public String rank = "//div[@class='course-rating']";

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
        WebElement logo = super.driver.findElement(By.xpath(title));
        WebElement logo1 = super.driver.findElement(By.xpath(rank));
        waitElementsUntilIsVisible(super.driver, logo);
    }

    public String getTitle() {
        return title;
    }

    public String getRank() {
        return rank;
    }
}
