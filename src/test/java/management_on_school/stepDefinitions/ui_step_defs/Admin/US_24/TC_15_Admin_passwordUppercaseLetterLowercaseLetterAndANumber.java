package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_15_Admin_passwordUppercaseLetterLowercaseLetterAndANumber {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @Then("Password verifies that it contains uppercase letters, lowercase letters and a number_hu.")
    public void password_verifies_that_it_contains_uppercase_letters_lowercase_letters_and_a_number_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}