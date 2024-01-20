package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_05_emailMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Email in the box {string} enters_hu")
    public void email_in_the_box_enters_hu(String str) {
        String email = faker.internet().emailAddress();
        if (str.equals("e mail")) {
            viceDean.email_hu.sendKeys(email);
        } else {
            viceDean.email_hu.sendKeys(str);

        }
        ReusableMethods.waitForSecond(1);
    }

    @Then("Email registration has been confirmed_hu")
    public void email_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }
}