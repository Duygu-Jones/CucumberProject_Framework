package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_12_Admin_userNameMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("UserName new {string} enters the box_hu.")
    public void user_name_new_enters_the_box_hu(String str) {
        String username = faker.random().nextInt(1000,9999)+ "ali";
        if (str.equals("a username")) {
            admin.usernameBox_hu.sendKeys(username);
        } else {
            admin.usernameBox_hu.sendKeys(str);
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("UserName registration has been confirmed_hu.")
    public void user_name_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}