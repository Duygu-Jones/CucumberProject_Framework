package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_14_passwordIsLessThanEightCharacters {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;


    @Then("Password It is confirmed that it gives a warning when it is less than 8 characters._hu")
    public void password_When_there_are_less_than_8_characters_the_warning_is_verified_hu() {
        Assert.assertTrue(viceDean.AtLeast8Characters_hu.isDisplayed());
        ReusableMethods.waitForSecond(2);
    }
}