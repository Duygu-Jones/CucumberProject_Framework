package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_06_phoneNumberMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Phone in the box {string} enters_hu")
    public void phone_in_the_box_enters_hu(String str) {
        if (str.equals("a phone number")) {
            String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
            viceDean.phoneNumber_hu.sendKeys(ListPhoneNo);
        } else {
            viceDean.phoneNumber_hu.sendKeys(str);
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("Phone registration has been confirmed_hu")
    public void phone_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}