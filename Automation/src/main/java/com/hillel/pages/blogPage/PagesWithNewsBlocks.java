package com.hillel.pages.blogPage;

import com.hillel.pages.BasePage;
import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;

public class PagesWithNewsBlocks extends BasePage {

    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[1]")
    private WebElement frontEndBtn;
    @FindBy(xpath = "//a[@class='block-anchor']")
    private List<WebElement> blocksOfFENews;

    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[5]")
    public WebElement gameDevBtn;
    @FindBy(xpath = "//a[@class='block-anchor']")
    public List<WebElement> blocksOfGDNews;

    @FindBy(xpath = "(//a[@class='btn-theme theme-list_link'])[9]")
    public WebElement qaBtn;
    @FindBy(xpath = "//a[@class='block-anchor']")
    public List<WebElement> blocksOfQA;

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
    public void clickOnFrontEndBtn(){
        waitElementsUntilIsClickable(driver, frontEndBtn);
        frontEndBtn.click();
    }
//    public void visibilityOfBlocks(){
//        waitElementsUntilIsVisible(driver, blocksOfNews);
//        blocksOfNews.isDisplayed();
//    }
    public int blocksOnTheFrontEndPage(){
        return blocksOfFENews.size();
    }
    public void clickOnGameDevBtn(){
        waitElementsUntilIsClickable(driver, gameDevBtn);
        gameDevBtn.click();
    }
    public int blocksOnTheGameDevPage(){
        return blocksOfGDNews.size();
    }
    public void clickOnTheQA(){
        waitElementsUntilIsClickable(driver, qaBtn);
        qaBtn.click();
    }
    public int blocksOnTheQA(){
        return blocksOfQA.size();
    }
    public void setFrontEndBlocks(String frontEnd){
        for (WebElement element: blocksOfFENews){
            blocksOfFENews.size();
        }
    }
    public void setGameDevBlocks(String gameDev){
        for (WebElement element: blocksOfGDNews){
            blocksOfGDNews.size();
        }
    }
    public void setQABlocks(String qa){
        for (WebElement element: blocksOfQA){
            blocksOfQA.size();
        }
    }
}
