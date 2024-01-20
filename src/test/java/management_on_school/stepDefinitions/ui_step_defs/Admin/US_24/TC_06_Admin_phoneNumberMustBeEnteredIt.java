package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_06_Admin_phoneNumberMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Phone in the box {string} enters_hu.")
    public void phone_in_the_box_enters_hu(String str) {
        if (str.equals("a phone number")) {
            String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
            admin.phoneNumber_hu.sendKeys(ListPhoneNo);
        } else {
            admin.phoneNumber_hu.sendKeys(str);
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("Phone registration has been confirmed_hu.")
    public void phone_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}