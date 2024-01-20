package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_13_passwordAtLeastEightCharacters {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Enter the password {string} in the password box_hu")
    public void Enter_the_password_in_the_password_box_hu(String string) {
        viceDean.passwordBox_hu.sendKeys(string);
    }

    @Then("Password registration has been confirmed_hu")
    public void password_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}