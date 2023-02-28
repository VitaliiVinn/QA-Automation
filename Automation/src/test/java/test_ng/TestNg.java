package test_ng;

import com.hillel.core.data.DataProviderMethods;
import com.hillel.pages.AutomationCourse;
import com.hillel.pages.FreeConsultationPage;
import org.junit.runners.Parameterized;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestNg extends BaseTestForTestNG {

    AutomationCourse automationCourse = new AutomationCourse(driver);
    FreeConsultationPage freeConsultationPage = new FreeConsultationPage(driver);

    @Test(description = "Open new page", priority = 2)
    public void testNGtesting(){
//        AutomationCourse automationCourse = new AutomationCourse(driver);
//        automationCourse.pageOpen();
    }

    @Test(description = "Open new page", priority = 1)
    public void testNGtestingAsserts(){
//        AutomationCourse automationCourse = new AutomationCourse(driver);
//        automationCourse.pageOpen();
//        Assert.assertEquals(automationCourse.commonQuestionsMethod(), 9, "Not equal");
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
