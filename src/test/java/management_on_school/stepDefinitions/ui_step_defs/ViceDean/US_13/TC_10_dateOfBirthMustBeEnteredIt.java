package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_10_dateOfBirthMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("DateOfBirth in the box {string} enters_hu")
    public void date_of_birth_in_the_box_enters_hu(String tarih) {
        viceDean.birthDay_hu.sendKeys(tarih);
        ReusableMethods.waitForSecond(1);
    }
    @Then("DateOfBirth registration has been confirmed_hu")
    public void date_of_birth_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}