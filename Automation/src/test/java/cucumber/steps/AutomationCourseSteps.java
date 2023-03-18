package cucumber.steps;

import com.hillel.pages.AutomationCourse;
import com.hillel.pages.BasePage;
import com.hillel.pages.FreeConsultationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

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
//    @Then("Information is found")
//    public void informationIsFound(){
//
//    }
//    @When("I fill the following parameters")
//    public void iFillTheFollowingParameters(List<Map<String, String >>params){
//        Map<String, String> row = params.get(0);
//        FreeConsultationPage freeConsultationPage = new FreeConsultationPage(driver);
//        freeConsultationPage.setName(row.get("name"));
//        freeConsultationPage.setEmail(row.get("email"));
//        freeConsultationPage.setPhone(row.get("phone"));
//        freeConsultationPage.setMessenger(row.get("messenger"));
//        freeConsultationPage.setCourses(row.get("course"));
//    }
//    @When ("Click free consult button")
//            public void clickFreeConsultButton(){
//        AutomationCourse automationCourse = new AutomationCourse(driver);
//        automationCourse.clickFreeConsultation();
//    }
}
