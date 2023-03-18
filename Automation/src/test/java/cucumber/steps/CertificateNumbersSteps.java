package cucumber.steps;

import com.hillel.pages.AutomationCourse;
import com.hillel.pages.BasePage;
import com.hillel.pages.CertificatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CertificateNumbersSteps extends BaseUiSteps {
    //Напишіть сценарій у feature файлі , який вводить різні значення в полі, Перевірка сертифікату на сторінці
    // https://certificate.ithillel.ua/ і перевіряє, чи відображається напис: "Сертифікат не знайдено."
    // Тест повинен перевірити 4 рядки різної довжини. Використовуйте Scenario Outline + Examples
    BasePage page = null;

    @Given("I am on Certificate page")
    public void openPage(String pageName) {
        switch (pageName) {
            case "Certificate":
                page = new CertificatePage(driver);
                break;
            default:
                throw new IllegalArgumentException("No such page " + pageName);
        }
        page.pageOpen();
    }

    @When("I input Certificate number")
    public void inputTheCertificateNumber(String arg1, String arg2, String arg3) {
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(arg1);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(arg2);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(arg3);


    }

    @Then("I receive <result> the Certificate number")
    public void resultOfInputNumber() {
        CertificatePage certificatePage = new CertificatePage(driver);
        certificatePage.clickCheckBtn();
        Assert.assertTrue((((CertificatePage) page).getShowResult().isDisplayed()));
    }
}
