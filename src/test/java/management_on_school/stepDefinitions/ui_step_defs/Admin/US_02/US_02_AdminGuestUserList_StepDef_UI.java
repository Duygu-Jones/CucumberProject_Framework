package management_on_school.stepDefinitions.ui_step_defs.Admin.US_02;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import management_on_school.pages.AdminPage;
import management_on_school.pages.GuestUserListPage;
import management_on_school.pages.HomePage;
import management_on_school.utilities.ConfigReader;
import management_on_school.utilities.Driver;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class US_02_AdminGuestUserList_StepDef_UI {

    HomePage homePage=new HomePage();
    AdminPage adminPage=new AdminPage();
    GuestUserListPage guestUserPage =new GuestUserListPage();

    @Given("dj user goes to the page Url")
    public void djUserGoesThePageUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("dj admin clicks to login button")
    public void djUserClicksToLoginButton() {
        ReusableMethods.waitForSecond(2);
        ReusableMethods.jsClick(homePage.loginMainDj);
    }

    @And("dj admin login with user credentials")
    public void djUserLoginWithUserCredentials() {
        homePage.usernameDj.sendKeys(ConfigReader.getProperty("admin_username"), Keys.TAB,
                                     ConfigReader.getProperty("admin_password"),Keys.TAB,Keys.ENTER);
    }

    @Then("tb user verifies if navigated to the admin management page")
    public void tbUserVerifiesIfNavigatedToTheAdminManagementPage() {
        ReusableMethods.waitForSecond(3);
        String expectedUrl = "https://managementonschools.com/admin-management";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("dj user clicks on the menu button")
    public void djUserClicksOnTheMenuButton() {
        ReusableMethods.waitForSecond(2);
        adminPage.adminMenuButtonDj.click();
    }

    @And("dj user clicks the guest user button")
    public void djUserClicksTheGuestUserButton() {
        ReusableMethods.waitForSecond(2);
        guestUserPage.adminGuestUserDj.click();
    }

    @Then("dj user verifies,Guest User List title is visible")
    public void dj_user_verifies_guest_user_list_title_is_visible() {
        ReusableMethods.waitForSecond(2);
        assertTrue(guestUserPage.guestUserListTitleDj.isDisplayed());
    }

    @And("dj user verifies,name is visible")
    public void djUserVerifiesNameIsVisible() {
        ReusableMethods.waitForSecond(1);
//        List<WebElement> nameList = guestUserPage.guestNamesListDj;
//        List<String> names = new ArrayList<>();
//        for (WebElement w : nameList) {
//            names.add(w.getText());
//        }
//        Assert.assertTrue(names.contains("Team05Guest Perfect")); //73.page, 2.row??

        assertTrue(guestUserPage.guestNamesListDj.get(0).isDisplayed());

    }

    @And("dj user verifies, phone number is visible")
    public void djUserVerifiesPhoneNumberIsVisible() {
        ReusableMethods.waitForSecond(1);
        assertTrue(guestUserPage.guestPhoneNumsListDj.get(0).isDisplayed());

//        List<WebElement> guestPhoneList = guestUserPage.guestPhoneNumsListDj;
//        List<String> phoneNumbers = guestPhoneList.stream().map(WebElement::getText).collect(Collectors.toList());
//        Assert.assertTrue(phoneNumbers.contains("guest_phone"));
    }

    @And("dj user verifies, ssn is visible")
    public void djUserVerifiesSsnIsVisible() {
        ReusableMethods.waitForSecond(1);
        assertTrue(guestUserPage.guestSsnNumsListDj.get(0).isDisplayed());
    }

    @And("dj user verifies, Username is visible")
    public void djUserVerifiesUsernameIsVisible() {
        ReusableMethods.waitForSecond(1);
        assertTrue(guestUserPage.guestUserNamesListDj.get(0).isDisplayed());
    }

    @And("dj user clicks the delete")
    public void djUserClicksTheDelete() {
        ReusableMethods.waitForSecond(1);
        ReusableMethods.jsClick(guestUserPage.guestDeleteButtonListDj.get(0));
    }

    @And("dj close the browser")
    public void djCloseTheBrowser() {
        Driver.closeDriver();
    }


    //----------GuestUser Register ----------------------

    @Then("dj Clicks on the register button")
    public void dj_clicks_on_the_register_button() {
        ReusableMethods.jsClick(homePage.registerButtonDj);
    }


    @Then("dj Fills the required information and clicks on Register")
    public void dj_fills_the_required_information_and_clicks_on_register() {
        guestUserPage.guestNameBoxDj.sendKeys(
                        "GuestDuyguJ",Keys.TAB,     //Name
                                    "Joneses", Keys.TAB,        //Surname
                                    "Wales",Keys.TAB,           //BirthPlace
                                    "444-932-1901",Keys.TAB,    //Phone
                                                   Keys.TAB,    //Gender skipped
                                    "01011990",Keys.TAB,        //BirtDate
                                    "823-10-7392",Keys.TAB,     //SSN no
                                    "00GuestDuyguJ",Keys.TAB,  //Username
                                    "Project14",Keys.TAB,       //password
                                            Keys.ENTER);        //clicks on Register button
        ReusableMethods.waitForSecond(2);

    }
    @Then("dj user verifies,Guest User registered successfully")
    public void dj_user_verifies_guest_user_registered_successfully() {
        Assert.assertTrue(guestUserPage.guestRegisterVerifyDj.isDisplayed());
        ReusableMethods.waitForSecond(1);
    }



}