package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_11_ssnMustBeEnteredIt {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    public static String ListSSNNo;
    @And("SSN in the box {string} enters_hu")
    public void ssn_in_the_box_enters_hu(String ssn) {
        if (ssn.equals("an ssn number")) {
            ListSSNNo = faker.regexify("[0-8]{3}-[0-9]{2}-[0-9]{4}");
            viceDean.ssnBox_hu.sendKeys(ListSSNNo);
        } else {
            viceDean.ssnBox_hu.sendKeys(ssn);
        }
        ReusableMethods.waitForSecond(1);
    }
    @Then("SSN registration has been confirmed_hu")
    public void ssn_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

}