package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_10_Admin_dateOfBirthMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("DateOfBirth in the box {string} enters_hu.")
    public void date_of_birth_in_the_box_enters_hu(String tarih) {
        admin.birthDay_hu.sendKeys(tarih);
        ReusableMethods.waitForSecond(1);
    }
    @Then("DateOfBirth registration has been confirmed_hu.")
    public void date_of_birth_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}