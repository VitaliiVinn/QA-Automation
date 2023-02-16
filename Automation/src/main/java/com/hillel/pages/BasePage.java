package com.hillel.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public abstract void pageOpen();
    public abstract void ensureOpened();
}
