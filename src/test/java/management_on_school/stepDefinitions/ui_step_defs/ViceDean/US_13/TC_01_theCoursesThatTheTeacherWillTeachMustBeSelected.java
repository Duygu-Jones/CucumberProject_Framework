package management_on_school.stepDefinitions.ui_step_defs.ViceDean.US_13;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import management_on_school.pages.ViceDeanPage;
import management_on_school.utilities.ConfigReader;
import management_on_school.utilities.Driver;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.sql.ResultSet;

public class TC_01_theCoursesThatTheTeacherWillTeachMustBeSelected {

    ResultSet resultSet;
    ViceDeanPage viceDean = new ViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @Given("User enters the website_hu")
    public void user_enters_the_website_hu() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("User clicks on login_hu")
    public void user_clicks_on_login_hu() {
        viceDean = new ViceDeanPage();
        if (viceDean.loginLink_hu.isDisplayed()) {
            viceDean.loginLink_hu.click();
        } else {
            viceDean.menuButton_hu.click();
        }
    }

    @When("Username in the box {string} enters_hu")
    public void username_enters_hu(String string) {
        viceDean.usernameBox_hu.sendKeys(string);
    }

    @When("Password in the box {string} enters_hu")
    public void password_enters_hu(String string) {
        viceDean.passwordBox_hu.sendKeys(string);
    }

    @When("Click on the login button_hu")
    public void click_on_the_login_button_hu() {
        ReusableMethods.jsClick(viceDean.loginButton_hu);
    }

    @When("Clicks the menu button_hu")
    public void clicks_the_menu_button_hu() {
        viceDean.menuButton_hu.click();
        ReusableMethods.waitForSecond(1);
    }

    @And("Teacher Management clicks the button_hu")
    public void teacher_management_clicks_the_button_hu() {
        viceDean.teacherManagementButton_hu.click();
    }


    @And("JavaScript choose your lesson_hu")
    public void javascriptchoose_your_lesson_hu() {
        ReusableMethods.jsClick(viceDean.chooseLesson_hu);
        ReusableMethods.waitForSecond(1);

        viceDean.chooseLesson_hu.sendKeys("JavaScript", Keys.ENTER);
        ReusableMethods.waitForSecond(1);
    }

    @Then("Course registration has been confirmed_hu")
    public void course_registration_has_been_confirmed_hu() {
        Assert.assertTrue(viceDean.SavedPopUp_hu.isDisplayed());
    }

    @And("Close page_hu")
    public void close_page_hu() { Driver.closeDriver(); }


}
