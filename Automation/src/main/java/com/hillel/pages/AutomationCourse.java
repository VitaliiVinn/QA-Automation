package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;
import static com.hillel.util.core.WaitUtils.waitElementsUntilIsVisible;

public class AutomationCourse extends BasePage {
    @FindBy(xpath = "//span[@class='course-descriptor_header-text']")
    private String title;
    @FindBy(xpath = "//div[@class='course-rating']")
    private String rank;
    @FindBy(xpath = "(//div[@class='course-bar_body'])[3]")
    private WebElement programBtn;
    @Getter
    @FindBy(xpath = "//button[@id='btn-consultation-hero']")
    private WebElement consultationBtn;

    @FindBy(xpath = "//a[@href='https://ithillel.ua/courses/programming']")
    private WebElement corsesBtn;

    @FindBy(xpath = "//ul[@id='accordion-faq']/li")
    private List<WebElement> commonQuestion;
    @FindBy(xpath = "//ul[@class='block-course-cats_list']/li")
    private List<WebElement> blockCourse;


    public AutomationCourse(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void pageOpen() {
        super.driver.get(ConfigProvider.BASE_URL);
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
//        WebElement logo = super.driver.findElement(By.xpath(title));
//        WebElement logo1 = super.driver.findElement(By.xpath(rank));
//        waitElementsUntilIsVisible(super.driver, logo);
//        waitElementsUntilIsVisible(super.driver, logo1);
    }
    public void clickRank() {
        waitElementsUntilIsClickable(driver, programBtn);
        programBtn.click();
    }

    public void clickFreeConsultation() {
        waitElementsUntilIsClickable(driver, consultationBtn);
        consultationBtn.click();
    }

    public void clickProgranmmingCourseBtn() {
        waitElementsUntilIsClickable(driver, corsesBtn);
        corsesBtn.click();
    }
    public int getBlockCoursesSize(){
        return blockCourse.size();
    }

    public int commonQuestionsMethod() {
        return commonQuestion.size();
    }

    public String getTitle() {
        return driver.findElement(By.xpath(title)).getText();
    }

    public String getRank() {
        return driver.findElement(By.xpath(rank)).getText();
    }
}
