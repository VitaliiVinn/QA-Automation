package junit;

import com.hillel.pages.AutomationCourse;
import com.hillel.pages.FreeConsultationPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class JunitTest extends BaseTest {
    AutomationCourse automationCourse = new AutomationCourse(driver);
    FreeConsultationPage freeConsultationPage = new FreeConsultationPage(driver);
    @Parameterized.Parameters(name = "name={0}, email={1}, phone={2}, messenger={3}, course={4}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"John", "john@kib.kf", "0567521255", "tg", "PHP"},
                {"Vasya", "jn@kib.kf", "0567661255", "vb", "JAVA"},
                {"Petr", "hn@kib.kf", "0667521255", "tg", "JS"}
        });
    }
    @Parameterized.Parameters(0)
    public String name;
    @Parameterized.Parameters(1)
    public String email;
    @Parameterized.Parameters(2)
    public String phone;
    @Parameterized.Parameters(3)
    public String messenger;
    @Parameterized.Parameters(4)
    public String course;

    @Test
    public void firstJunitTest() {
        automationCourse.pageOpen();
        automationCourse.clickRank();
    }

    @Test
    public void freeConsultTest() {
        automationCourse.pageOpen();
        automationCourse.clickFreeConsultation();
        freeConsultationPage.setName(name);
        freeConsultationPage.setEmail(email);
        freeConsultationPage.setPhone(phone);
        freeConsultationPage.setMessenger(messenger);
        freeConsultationPage.setCourses(course);

    }
}
