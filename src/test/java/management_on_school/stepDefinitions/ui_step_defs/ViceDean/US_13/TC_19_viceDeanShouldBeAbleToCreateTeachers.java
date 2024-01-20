package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_19_viceDeanShouldBeAbleToCreateTeachers {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @When("Submit clicks the button_hu")
    public void submit_clicks_the_button_hu() {
        viceDean.SubmitButton_hu.click();
        ReusableMethods.waitForSecond(2);
    }

    @Then("Vice Dean teacher registration is verified_hu")
    public void vice_dean_teacher_registered_done_verified_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}