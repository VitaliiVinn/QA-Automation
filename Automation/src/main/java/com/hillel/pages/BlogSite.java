package com.hillel.pages;

import com.hillel.util.core.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogSite extends BasePage{
    //Написати параметризований тест який йде на сторінку «Блог сайту» https://ithillel.ua/,
    // обирає категорію «Публікація за темами», и перевіряє кількість новин(через AssertJ,
    // що actualCollectionSize=expectedCollectionSize) для Front-End, QA, GameDev
    @FindBy(xpath = "//li[@class='site-nav-menu_item -blog']")
    private WebElement blogBtn;

    @FindBy(xpath = "//button[@class='site-nav-link']")
    private WebElement publicationsBtn;

    public BlogSite(WebDriver driver) {
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
}
