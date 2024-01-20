package management_on_school.stepDefinitions.ui_step_defs.Admin.US_24;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.AdminPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_04_Admin_birthPlaceMustBeEnteredIt {

    ResultSet resultSet;
    AdminPage admin = new AdminPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("BirthPlace in the box {string} enters_hu.")
    public void birth_place_in_the_box_enters_hu(String str) {
        String birthPlace = faker.lorem().word();
        if (str.equals("a place name")) {
            admin.birthPlace_hu.sendKeys(birthPlace);
        } else {
            admin.birthPlace_hu.sendKeys(str);

        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("BirthPlace registration has been confirmed_hu.")
    public void birth_place_registration_has_been_confirmed_hu() {
        Assert.assertTrue(admin.SavedPopUp_hu.isDisplayed());
    }
}