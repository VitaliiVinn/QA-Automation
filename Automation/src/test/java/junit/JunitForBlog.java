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

    @Parameterized.Parameters(name = "page={0}, blockOfNews={1}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"frontend", "blockNewsFe"},
                {"gameDev", "blockNewsOfGd"},
                {"qa", "blockNewsOfQA"}
        });
    }
    @Parameterized.Parameter(0)
    public String page;
    @Parameterized.Parameter(1)
    public String clickNews;
    @Test
    public void clickTopics(){

    }
    @Test
    public void testPagesForClick() {
        ITHillelMainPage itHillelMainPage = new ITHillelMainPage(driver);
        PagesWithNewsBlocks pagesWithNewsBlocks = new PagesWithNewsBlocks(driver);
        itHillelMainPage.pageOpen();
        itHillelMainPage.clickForBlogBtn();
        pagesWithNewsBlocks.clickOnFrontEndBtn();
        pagesWithNewsBlocks.clickOnGameDevBtn();
        pagesWithNewsBlocks.clickOnTheQA();
        pagesWithNewsBlocks.setNews(page);
        pagesWithNewsBlocks.setNews(clickNews);
        Assert.assertEquals("Not equal", 20, clickNews);
    }
}
