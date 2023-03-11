package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;

public class CertificatePage extends BasePage {
    @Getter
    @Setter
    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement inputNumber;

    @Getter
    @FindBy(xpath = "//button[@class='btn btn-submit -submit certificate-check_submit']")
    private WebElement checkBtn;

    @Getter
    @FindBy(xpath = "//p[@class='certificate-check_message']")
    private WebElement showResult;

    public CertificatePage(WebDriver driver) {
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
    public void clickCheckBtn(){
        waitElementsUntilIsClickable(driver, checkBtn);
        checkBtn.click();
    }
}
