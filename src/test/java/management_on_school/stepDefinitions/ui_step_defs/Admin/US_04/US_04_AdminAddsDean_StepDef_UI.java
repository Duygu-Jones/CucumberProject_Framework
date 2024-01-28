package management_on_school.stepDefinitions.ui_step_defs.Admin.US_04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import management_on_school.pages.AdminPage;
import management_on_school.pages.AddDeanPage;
import management_on_school.pages.HomePage;
import management_on_school.utilities.ConfigReader;
import management_on_school.utilities.Driver;
import management_on_school.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class US_04_AdminAddsDean_StepDef_UI {
    HomePage homePage=new HomePage();
    AdminPage adminPage=new AdminPage();
    AddDeanPage addDeanPage =new AddDeanPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());

    String Ssn;

    @Given("admin goes the page url dj")
    public void adminGoesThePageUrlDj() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("admin clicks to login button dj")
    public void adminClicksToLoginButtonDj() {
        ReusableMethods.waitForSecond(1);
        ReusableMethods.jsClick(homePage.loginMainDj);
    }

    @And("admin login with user credentials dj")
    public void adminLoginWithUserCredentialsDj() {
        homePage.usernameDj.sendKeys(ConfigReader.getProperty("admin_username"), Keys.TAB,
                ConfigReader.getProperty("admin_password"),Keys.TAB,Keys.ENTER);
    }

    @Then("dj Admin verifies if navigated to the admin management page")
    public void djAdminVerifiesIfNavigatedToTheAdminManagementPage() {
        ReusableMethods.waitForSecond(1);
        String expectedUrl = "https://managementonschools.com/admin-management";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("dj Admin clicks on the menu button")
    public void djAdminClicksOnTheMenuButton() {
        adminPage.adminMenuButtonDj.click();
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin clicks on the dean management button")
    public void djAdminClicksOnTheDeanManagementButton() {
        ReusableMethods.jsClick(adminPage.deanManagementButtonDj);
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the name box")
    public void djAdminFillsTheNameBox() {
        actions.moveToElement(addDeanPage.deanManagementTitleDj);
        ReusableMethods.waitForSecond(1);
        addDeanPage.deanNameBoxDj.sendKeys(faker.name().firstName());
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the surname box")
    public void djAdminFillsTheSurnameBox() {
        addDeanPage.deanSurnameBoxDj.sendKeys(faker.name().lastName());
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the birthplace box")
    public void djAdminFillsTheBirthplaceBox() {
        addDeanPage.deanBirthPlaceBoxDj.sendKeys("Turkey");
        ReusableMethods.waitForSecond(1);
    }

    @And("dj User clicks on the gender {string} button")
    public void djAdminClicksOnTheGenderFemaleButton(String str) {

        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            ReusableMethods.jsClick(addDeanPage.deanFemaleCheckBoxDj);
            gender = "FEMALE";
        } else if (str.equalsIgnoreCase("MALE")) {
            ReusableMethods.jsClick(addDeanPage.deanFemaleCheckBoxDj);
            gender = "MALE";
        } else {
            System.out.println("You entered incorrect data");
        }
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the date of birth box")
    public void djAdminFillsTheDateOfBirthBox() {
        addDeanPage.deanBirthDateBoxDj.sendKeys("05051975");
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the phone box")
    public void djAdminFillsThePhoneBox() {
        String listPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        addDeanPage.deanPhoneBoxDj.sendKeys(listPhoneNo);
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the ssn box")
    public void djAdminFillsTheSsnBox() {
        String listSsnNo = faker.regexify("[0-9]{3}-[0-9]{2}-[0-9]{4}");
        addDeanPage.deanSsnBoxDj.sendKeys(listSsnNo);
        ReusableMethods.waitForSecond(1);
    }

    @And("dj Admin fills the username box")
    public void djAdminFillsTheUsernameBox() {
        addDeanPage.deanUsernameBoxDj.sendKeys(faker.name().username());
        ReusableMethods.waitForSecond(1);
        // String username = faker.random().nextInt(1000,9999)+ "ali";
        // deanPage.deanUsernameBoxDj.sendKeys(username);
    }

    @And("dj Admin fills the password box")
    public void djAdminFillsThePasswordBox() {
        ReusableMethods.waitForSecond(1);
        addDeanPage.deanPasswordBoxDj.sendKeys("12345678Aa");
    }

    @And("dj Admin clicks on the submit button")
    public void djAdminClicksOnTheSubmitButton() {
        ReusableMethods.waitForSecond(1);
        ReusableMethods.jsClick(addDeanPage.addDeanSubmitButtonDj);
    }

    @Then("dj Admin verifies if the Dean Saved popup is displayed")
    public void djAdminVerifiesIfTheDeanSavedPopupIsDisplayed() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanSavedVerifyDj.isDisplayed());
    }
//-------------senario 2------------------
    @And("dj Admin fills the invalids {string} ssn box")
    public void djAdminFillsTheInvalidsSsnBox(String ssnNum) {
        addDeanPage.deanSsnBoxDj.sendKeys(ssnNum);
        Ssn= ssnNum;
        ReusableMethods.waitForSecond(2);
    }

    @And("dj Admin verifies if the Ssn Ssn required text is displayed to the admin management page")
    public void djAdminVerifiesIfTheSsnSsnRequiredTextIsDisplayedToTheAdminManagementPage() {
        if (Ssn.length() == 11) {
            ReusableMethods.waitForVisibleElement(addDeanPage.ssnRequiredVerifyDj, 3);
            assertTrue(addDeanPage.ssnRequiredVerifyDj.getText().contains("Please enter valid SSN number"));
        }
        if (Ssn.length() > 11) {
            ReusableMethods.waitForVisibleElement(addDeanPage.ssnRequiredVerifyDj, 3);
            assertTrue(addDeanPage.ssnRequiredVerifyDj.getText().contains("Please enter valid SSN number"));
        }
        if (Ssn.length() < 11) {

            assertTrue(addDeanPage.ssnRequiredVerifyDj.getText().contains("Minimum 11 character (XXX-XX-XXXX)"));
        }
    }


 //----------senario3--------------------
    @And("dj Admin fills the empty {string} box")
    public void djAdminFillsTheEmptyBox(String emptyName) {
        ReusableMethods.waitForSecond(2);
        addDeanPage.deanNameBoxDj.sendKeys(emptyName);
    }

    @And("dj Admin verifies if the name required text is displayed to the admin management page")
    public void djAdminVerifiesIfTheNameRequiredTextIsDisplayedToTheAdminManagementPage() {
        ReusableMethods.waitForSecond(2);
        Assert.assertTrue(addDeanPage.nameRequiredVerifyDj.isDisplayed());
    }

    @And("dj Admin fills the password box invalid {string}")
    public void djAdminFillsThePasswordBoxInvalid(String pwd) {
        addDeanPage.deanPasswordBoxDj.sendKeys(pwd);
    }

    @And("dj Admin verifies if the valid phone number required text is displayed to the admin management page")
    public void djAdminVerifiesIfTheOneNumberTextIsDisplayedToTheAdminManagementPage() {
        ReusableMethods.waitForSecond(2);
        Assert.assertTrue(addDeanPage.unValidPasswordVrifyDj.getText().contains("One number"));
    }
}
