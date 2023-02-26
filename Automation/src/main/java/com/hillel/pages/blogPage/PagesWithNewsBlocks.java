package com.hillel.pages.blogPage;

import com.hillel.pages.BasePage;
import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;

public class PagesWithNewsBlocks extends BasePage {


    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[1]")
    private WebElement frontEndBtn;
    @FindBy(xpath = "//ul[@class='posts_list post-list']/li")
    private List<WebElement> blocksOfNews;
    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[5]")
    public WebElement gameDevBtn;
    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[9]")
    public WebElement qaBtn;

    ArrayList<String> arrayList = new ArrayList<>();


    public PagesWithNewsBlocks(WebDriver driver) {
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

    public void clickOnFrontEndBtn() {
        waitElementsUntilIsClickable(driver, frontEndBtn);
        frontEndBtn.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        for (int second = 0; ; second++) {
            if (second >= 60) {
                break;
            }
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.navigate().back();
    }

    public int blocksOnAnyPublicPage() {
        return blocksOfNews.size();
    }

    public void clickOnGameDevBtn() {
        waitElementsUntilIsClickable(driver, gameDevBtn);
        gameDevBtn.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        for (int second = 0; ; second++) {
            if (second >= 60) {
                break;
            }
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.navigate().back();
    }

    public void clickOnTheQA() {
        waitElementsUntilIsClickable(driver, qaBtn);
        qaBtn.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        for (int second = 0; ; second++) {
            if (second >= 60) {
                break;
            }
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setNews(String amountNews) {
        for (WebElement element : this.blocksOfNews) {
            if(element.getText().equals(amountNews)){
                element.click();
            }
        }
    }

}
