package com.hillel.pages.blogPage;

import com.hillel.pages.BasePage;
import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.hillel.util.core.WaitUtils.waitElementsUntilIsClickable;

public class ITHillelMainPage extends BasePage {
    //Написати параметризований тест який йде на сторінку «Блог сайту» https://ithillel.ua/,
    // обирає категорію «Публікація за темами», и перевіряє кількість новин(через AssertJ,
    // що actualCollectionSize=expectedCollectionSize) для Front-End, QA, GameDev
    @FindBy(xpath = "//li[@class='site-nav-menu_item -blog']")
    private WebElement blogBtn;

    public ITHillelMainPage(WebDriver driver) {
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
    public void clickForBlogBtn(){
        waitElementsUntilIsClickable(driver, blogBtn);
        blogBtn.click();
    }
}
