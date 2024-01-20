package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_07_Admin_isAdvisorTeacher {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Is Advisor Teacher_hu.")
    public void is_advisor_teacher_hu() {
        admin.isAdvisorTeacher_hu.click();
        ReusableMethods.waitForSecond(1);
    }
    @Then("Is Advisor registration has been confirmed_hu.")
    public void is_advisor_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}