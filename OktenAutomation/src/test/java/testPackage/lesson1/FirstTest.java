package testPackage.lesson1;

import base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.util.Base64;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends BaseTest {
//    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("Before suite");
//    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("Before class");
//    }

//    @Test
//    public void firstTest() throws InterruptedException {
////        System.out.println("This is test");
////        Selenide.open("https://www.google.com");
////        Thread.sleep(5000);
////        $(By.xpath("//div[@lass='asadaaa']")).click();
//    }
    @Test(priority = 2, description = "Something about test")
    public void test1(){
        System.out.println("First test");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("Second test");
    }
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("After method");
//    }
//    @AfterClass
//    public void afterClass(){
//        System.out.println("After class");
//    }
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("After suite");
//    }
}
