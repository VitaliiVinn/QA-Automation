package com.hilel.core.pages;

import com.hilel.core.util.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseOfAutomation extends BasePage {
    public  String title = "//span[@class='course-descriptor_header-text']";
    public  String rate = "//span[@class='course-rating_average']";

    public CourseOfAutomation(WebDriver driver) {
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
        WebElement logo1 = super.driver.findElement(By.xpath(rate));
    }
    public String getCourseTitle() {
        return title;
    }
    public String getCourseRate() {
        return rate;
    }
}



