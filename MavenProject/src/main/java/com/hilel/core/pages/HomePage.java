package com.hilel.core.pages;

import com.hilel.core.util.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hilel.core.util.WaitUtils.waitElementsUntilIsVisible;

public class HomePage extends BasePage {
    public String linkAutomatization = "//div[@class='section-content']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void pageOpen() {
        super.driver.get(ConfigProvider.BASE_URL);
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
        WebElement logo = super.driver.findElement(By.xpath(linkAutomatization));
        waitElementsUntilIsVisible(super.driver, logo);
    }
}



