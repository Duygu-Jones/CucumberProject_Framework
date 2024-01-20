package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_03_Admin_surnameMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("SurName  in the box {string} enters_hu.")
    public void sur_name_enters_hu(String str) {
        String surname = faker.name().lastName();
        if (str.equals("bir SurName")) {
            admin.surName_hu.sendKeys(surname);
        } else {
            admin.surName_hu.sendKeys(str);
        }
        ReusableMethods.waitForSecond(1);
    }

    @Then("SurName registration has been confirmed_hu.")
    public void sur_name_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }

}