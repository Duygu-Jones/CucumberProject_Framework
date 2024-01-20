package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_08_genderMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Gender {string} enters your option_hu")
    public void gender_enters_your_option_hu(String str) {
        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            viceDean.femaleButton_hu.click();
            gender = "FEMALE";
        } else if (str.equalsIgnoreCase("MALE")) {
            viceDean.maleButton_hu.click();
            gender = "MALE";
        } else {
            System.out.println("You entered incorrect data");
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("Gender registration has been confirmed_hu")
    public void gender_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}