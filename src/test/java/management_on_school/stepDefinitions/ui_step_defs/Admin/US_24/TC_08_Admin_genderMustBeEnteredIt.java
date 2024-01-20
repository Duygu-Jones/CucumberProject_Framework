package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_08_Admin_genderMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Gender {string} enters your option_hu.")
    public void gender_enters_your_option_hu(String str) {
        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            admin.femaleButton_hu.click();
            gender = "FEMALE";
        } else if (str.equalsIgnoreCase("MALE")) {
            admin.maleButton_hu.click();
            gender = "MALE";
        } else {
            System.out.println("You entered incorrect data");
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("Gender registration has been confirmed_hu.")
    public void gender_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}