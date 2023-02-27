package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;

public class FreeConsultationPage extends BasePage {

    @FindBy(xpath = "//input[@id='input-name-consultation']")
    private WebElement userName;
    @FindBy(xpath = "//input[@id='input-email-consultation']")
    private WebElement userEmail;
    @FindBy(xpath = "//input[@id='input-tel-consultation']")
    private WebElement userPhone;
    @FindBy(xpath = "//div[@id='container-input-course-consultation']")
    private WebElement chooseCourseTable;
    @FindBy(xpath = "//div[@class='socials-input-triggers']/button")
    private List<WebElement> messengersList;
    @FindBy(xpath = "//ul[@class='listbox_opt-list -scrollbar']/li")
    private List<WebElement> coursesList;

    public FreeConsultationPage(WebDriver driver) {
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

    }
    public void setName(String name){
        userName.sendKeys(name);
    }
    public void setEmail(String email){
        userEmail.sendKeys(email);
    }
    public void setPhone(String phone){
        userPhone.sendKeys(phone);
    }
    public void setMessenger(String messenger){
        for(WebElement element: this.messengersList){
            if(element.getAttribute("data-name").equals(messenger)){
                element.click();
            }
        }
    }
    public void setCourses(String courses){
        for(WebElement element: this.coursesList){
            if(element.getText().equals(courses)){
                element.click();
            }
        }
    }
    public void chooseCourseField(){
        waitElementsUntilIsClickable(driver, chooseCourseTable);
        chooseCourseTable.click();
    }

}
