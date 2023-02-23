package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;
import static com.hillel.util.core.WaitUtils.waitElementsUntilIsVisible;

public class AutomationCourse extends BasePage{
    @FindBy(xpath = "//span[@class='course-descriptor_header-text']")
    private String title;
    @FindBy(xpath = "//div[@class='course-rating']")
    private String rank;
    @FindBy(xpath = "(//div[@class='course-bar_body'])[3]")
    private WebElement programBtn;
    @FindBy(xpath = "//button[@id='btn-consultation-hero']")
    private WebElement consultationBtn;
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
        waitElementsUntilIsVisible(super.driver, logo1);
    }
    public void clickRank(){
        waitElementsUntilIsClickable(driver, programBtn);
        programBtn.click();
    }
    public void clickFreeConsultation(){
        waitElementsUntilIsClickable(driver, consultationBtn);
        consultationBtn.click();
    }
    public String getTitle() {
        return driver.findElement(By.xpath(title)).getText();
    }
    public String getRank() {
        return driver.findElement(By.xpath(rank)).getText();
    }
}
