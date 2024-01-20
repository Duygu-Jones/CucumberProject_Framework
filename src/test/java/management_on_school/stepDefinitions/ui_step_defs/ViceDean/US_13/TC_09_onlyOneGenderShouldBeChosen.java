package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import org.junit.Assert;

import java.sql.ResultSet;

public class TC_09_onlyOneGenderShouldBeChosen {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;




@Then("Verifies that both genders cannot be selected at the same time_hu")
public void verifies_that_both_genders_cannot_be_selected_at_the_same_time_hu() {
    Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
}


}