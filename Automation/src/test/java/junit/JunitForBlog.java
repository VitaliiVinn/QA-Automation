package junit;

import com.hillel.pages.blogPage.PagesWithNewsBlocks;
import com.hillel.pages.blogPage.ITHillelMainPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class JunitForBlog extends BaseTest {

    @Parameterized.Parameters(name = "message={0}, actual={1}, expected={2}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Not equal", "10", "10"},
                {"Not equal", "5", "5"},
                {"Not equal", "15", "15"}
        });
    }
    @Parameterized.Parameter(0)
    public String message;
    @Parameterized.Parameter(1)
    public String actual;

    @Parameterized.Parameter(2)
    public String expected;

    @Test
    public void testPagesForClick() {
        ITHillelMainPage itHillelMainPage = new ITHillelMainPage(driver);
        PagesWithNewsBlocks pagesWithNewsBlocks = new PagesWithNewsBlocks(driver);
        itHillelMainPage.pageOpen();
        itHillelMainPage.clickForBlogBtn();
        pagesWithNewsBlocks.clickOnFrontEndBtn();
        pagesWithNewsBlocks.clickOnGameDevBtn();
        pagesWithNewsBlocks.clickOnTheQA();
        Assert.assertEquals(message, expected, actual);
    }
}
