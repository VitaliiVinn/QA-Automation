package com.hilel.core.pages;

import org.openqa.selenium.WebElement;

public class HillelPage {

    private WebElement title;
    private WebElement rate;

    public HillelPage(WebElement element) {
        title = element;
        rate = element;
    }
    public String getCourseTitle(){
        return title.getAttribute("value");
    }
    public String getCourseRate(){
        return rate.getAttribute("value");
    }
}


