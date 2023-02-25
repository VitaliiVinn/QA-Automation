package junit;

import com.hillel.pages.blogPage.PagesWithNewsBlocks;
import com.hillel.pages.blogPage.ITHillelMainPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class JunitForBlog extends BaseTest {

    @Parameterized.Parameters(name = "expacted={0}, actual={1}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {25},
                {15},
                {15}
        });
    }

    @Parameterized.Parameter(0)
    public String expected;
//    @Parameterized.Parameter(1)
//    public String actual;

    @Test
    public void testForClickingBlogBtn() {
        ITHillelMainPage itHillelMainPage = new ITHillelMainPage(driver);
        PagesWithNewsBlocks pagesWithNewsBlocks = new PagesWithNewsBlocks(driver);
        driver.manage().window().maximize();
//        JavascriptExecutor jsx = (JavascriptExecutor)driver;
//        jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        itHillelMainPage.pageOpen();
        itHillelMainPage.clickForBlogBtn();
        pagesWithNewsBlocks.clickOnFrontEndBtn();
//        pagesWithNewsBlocks.blocksOnTheFrontEndPage();
        Assert.assertEquals("Amount not equal", pagesWithNewsBlocks.setFrontEndBlocks(expected), 10);
        pagesWithNewsBlocks.setFrontEndBlocks(expected);
        driver.navigate().back();
        pagesWithNewsBlocks.clickOnGameDevBtn();
//        Assert.assertEquals("Amount not equal", pagesWithNewsBlocks.blocksOnTheGameDevPage(), 10);
//        pagesWithNewsBlocks.blocksOnTheGameDevPage();
        pagesWithNewsBlocks.setGameDevBlocks(expected);
        driver.navigate().back();
        pagesWithNewsBlocks.clickOnTheQA();
//        Assert.assertEquals("Amount not equal", pagesWithNewsBlocks.blocksOnTheQA(), 10);
//        pagesWithNewsBlocks.blocksOnTheQA();
        pagesWithNewsBlocks.setQABlocks(expected);
    }
}
