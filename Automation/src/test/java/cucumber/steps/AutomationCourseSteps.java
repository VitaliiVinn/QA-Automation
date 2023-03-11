package cucumber.steps;

import com.hillel.pages.AutomationCourse;
import com.hillel.pages.BasePage;
import com.hillel.pages.FreeConsultationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AutomationCourseSteps extends BaseUiSteps {
    BasePage page = null;
    @Given("I am on the {} Page")
    public void openPage (String pageName){
        switch (pageName){
            case "AutomationCourse":
                page = new AutomationCourse(driver);
                break;
            case "FreeConsultationPage":
                page = new FreeConsultationPage(driver);
                break;
            default:
                throw new IllegalArgumentException("No such page " + pageName);
        }
        page.pageOpen();
    }
    @Then("I can see FreeConsultationPage button")
    public void iCanSeeFreeConsultButton(){
        Assert.assertTrue(((AutomationCourse)page).getConsultationBtn().isDisplayed(),
                "Free Consult button does not display");

    }
}
