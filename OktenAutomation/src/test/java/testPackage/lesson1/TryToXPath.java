package testPackage.lesson1;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TryToXPath extends BaseTest {
    @Test
    public void firstXpath() {
//        $(By.className("submit-button")).click();
//        $(By.id("user-name")).append("Vitalii");
        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
        $(By.xpath("//input[contains(@class,'submit-button btn_action')]")).click();

        $(By.xpath("//div[contains(@class, 'inventory_item_name') and text()='Sauce Labs Backpack']")).click();
////        $(By.xpath("//div[@class= 'inventory_item']/child::div)[1]/following-sibling::div/preceding-sibling::div"));
        $(By.xpath("//button[text()='Open Menu']")).click();
//$(By.xpath("//button[text()='Open Menu']/parent::div/parent::div/following-sibling::div//a[position()=3]")).click();
//
//        $(By.xpath("//button[text()='Open Menu']/parent::div/parent::div/following-sibling::div//a[position()=2]")).click();
        $(By.xpath("//button[text()='Open Menu']/parent::div/parent::div/following-sibling::div//a[@id='about_sidebar_link']")).click();
        Selenide.back();
        $(By.xpath("//button[text()='Open Menu']")).click();
        $(By.xpath("//button[text()='Open Menu']/parent::div/parent::div/following-sibling::div//a[position()=3]")).click();

    }
}
