package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_02_nameMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @When("Name in the box {string} enters_hu")
    public void name_enters_hu(String str) {
        name = faker.name().firstName();
        if (str.equals("bir isim")) {
            viceDean.name_hu.sendKeys(name);
        } else {
            viceDean.name_hu.sendKeys(str);
        }
        ReusableMethods.waitForSecond(1);
    }

    @Then("Name registration has been confirmed_hu")
    public void name_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());

    }


}
