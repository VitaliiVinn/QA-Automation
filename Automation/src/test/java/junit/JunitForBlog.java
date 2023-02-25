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

@RunWith(Parameterized.class)
public class JunitForBlog extends BaseTest {

    @Parameterized.Parameters(name = "expected={0}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10},
                {15},
                {15}
        });
    }

    @Parameterized.Parameter(0)
    public int expected;

    @Test
    public void testForClickingBlogBtn() {
        ITHillelMainPage itHillelMainPage = new ITHillelMainPage(driver);
        PagesWithNewsBlocks pagesWithNewsBlocks = new PagesWithNewsBlocks(driver);
        itHillelMainPage.pageOpen();
        itHillelMainPage.clickForBlogBtn();
        pagesWithNewsBlocks.clickOnFrontEndBtn();
        pagesWithNewsBlocks.setNews(expected);
        Assert.assertEquals("Amount not equal", expected, 10);
        pagesWithNewsBlocks.clickOnGameDevBtn();
        pagesWithNewsBlocks.setNews(expected);
        Assert.assertEquals("Amount not equal", expected, 10);
        pagesWithNewsBlocks.clickOnTheQA();
        pagesWithNewsBlocks.setNews(expected);
        Assert.assertEquals("Amount not equal", expected, 10);
    }
}
