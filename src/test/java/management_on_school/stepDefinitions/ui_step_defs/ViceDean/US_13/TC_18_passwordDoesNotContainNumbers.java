package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_18_passwordDoesNotContainNumbers {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @Then("Passworden it is confirmed that it gives a warning when it does not contain at least one digit_hu")
    public void password_it_is_confirmed_that_itgives_a_warning_when_it_does_not_contain_at_least_one_digit_hu() {
        Assert.assertTrue(viceDean.OneNumber_hu.isDisplayed());
        ReusableMethods.waitForSecond(2);
    }

}