package test_ng;

import com.hillel.core.data.DataProviderMethods;
import com.hillel.pages.AutomationCourse;
import com.hillel.pages.FreeConsultationPage;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
@Log4j2
public class TestNg extends BaseTestForTestNG {
    AutomationCourse automationCourse = new AutomationCourse(driver);
    FreeConsultationPage freeConsultationPage = new FreeConsultationPage(driver);

    @Test(description = "Open new page", priority = 2)
    public void testNGtesting(){
        AutomationCourse automationCourse = new AutomationCourse(driver);
        automationCourse.pageOpen();
//        log.info("testNGtesting");
        Assert.assertEquals(7, automationCourse.getBlockCoursesSize(), "Question");
    }

    @Test(description = "Open new page", priority = 1)
    public void testNGtestingAsserts(){
        AutomationCourse automationCourse = new AutomationCourse(driver);
        automationCourse.pageOpen();
//        log.info("Page is opened");
        Assert.assertEquals(automationCourse.commonQuestionsMethod(), 9, "Not equal");
    }

    @Test(dataProvider = "data", dataProviderClass = DataProviderMethods.class)
    public void freeConsultTest(String name, String email, String phone, String messenger, String course) {
        automationCourse.pageOpen();
        automationCourse.clickFreeConsultation();
        freeConsultationPage.setName(name);
        freeConsultationPage.setEmail(email);
        freeConsultationPage.setPhone(phone);
        freeConsultationPage.setMessenger(messenger);
        freeConsultationPage.chooseCourseField();
        freeConsultationPage.setCourses(course);
    }
}
