package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_17_Admin_passwordDoesNotContainLowercaseLetters {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @Then("Password verify that it gives a warning when it does not contain lowercase letters_hu.")
    public void password_verify_that_it_gives_a_warning_when_it_does_not_contain_lowercase_letters_hu() {
        Assert.assertTrue(admin.OneLowercaseCharacter_hu.isDisplayed());
        ReusableMethods.waitForSecond(2);
    }

}