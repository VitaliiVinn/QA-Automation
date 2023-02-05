package com.hilel.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:\\My documents\\Testing work\\chromedriver.exe");
        System.setProperty("webdriver.opera.driver","F:\\My documents\\Testing work\\operadriver.exe");

        WebDriver driver = new ChromeDriver();
//        WebDriver driver1 = new OperaDriver();
    }
}
