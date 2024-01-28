package management_on_school.stepDefinitions.ui_step_defs.Admin.US_05;

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

public class US_05_AdminEditsDean_StepDef_UI {

    HomePage homePage=new HomePage();
    AdminPage adminPage=new AdminPage();
    AddDeanPage addDeanPage =new AddDeanPage();

//    Random rnd = new Random();
//    public int max=99;
//    public int min=10;
//    public int number = rnd.nextInt(max+1-min)+min;//10-99 arasinda sayi veriyor.

    @Given("dj Admin goes the page url")
    public void djUserGoesThePageUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("dj Admin clicks to login button")
    public void djUserClicksToLoginButton() {
        ReusableMethods.waitForSecond(2);
        ReusableMethods.jsClick(homePage.loginMainDj);
    }

    @And("dj Admin login with user credentials")
    public void djUserLoginWithUserCredentials() {
        homePage.usernameDj.sendKeys(ConfigReader.getProperty("admin_username"), Keys.TAB,
                ConfigReader.getProperty("admin_password"),Keys.TAB,Keys.ENTER);
    }

    @Then("dj admin verifies if navigated to the admin management page")
    public void djAdminVerifiesIfNavigatedToTheAdminManagementPage() {
        ReusableMethods.waitForSecond(3);
        String expectedUrl = "https://managementonschools.com/admin-management";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("dj admin clicks on the menu button")
    public void djAdminClicksOnTheMenuButton() {
        ReusableMethods.waitForSecond(2);
        adminPage.adminMenuButtonDj.click();
    }

    @And("dj admin clicks on the dean management button")
    public void djAdminClicksOnTheDeanManagementButton() {
        ReusableMethods.waitForSecond(2);
        ReusableMethods.jsClick(adminPage.deanManagementButtonDj);
    }

    @And("dj admin see the dean list")
    public void djAdminSeeTheDeanList() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanListTitleDj.isDisplayed());
    }

    @And("dj admin verifies,name is visible")
    public void djAdminVerifiesNameIsVisible() {
        ReusableMethods.waitForSecond(1);
//        List<WebElement> nameList = deanPage.deanNamesListDj;
//        List<String> names = new ArrayList<>();
//        for (WebElement w : nameList) {
//            names.add(w.getText());
//        }
//        Assert.assertTrue(names.contains("Team05Dean Perfect"));
        Assert.assertTrue(addDeanPage.deanNamesListDj.get(0).isDisplayed());

    }

    @And("dj admin verifies,gender is visible")
    public void djAdminVerifiesGenderIsVisible() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanGenderListDj.get(0).isDisplayed());

//        List<WebElement> deanGenderList = deanUserPage.deanGenderListDj;
//        List<String> deanGender = deanGenderListDj.stream().map(WebElement::getText).collect(Collectors.toList());
//        Assert.assertTrue(deanGender.contains("FEMALE"));

    }

    @And("dj admin verifies, phone number is visible")
    public void djAdminVerifiesPhoneNumberIsVisible() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanPhoneListDj.get(0).isDisplayed());
    }

    @And("dj admin verifies, ssn is visible")
    public void djAdminVerifiesSsnIsVisible() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanSsnNumsListDj.get(0).isDisplayed());
    }

    @And("dj admin verifies, Username is visible")
    public void djAdminVerifiesUsernameIsVisible() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanUserNamesListDj.get(0).isDisplayed());
    }

    @And("dj admin clicks on the edit button")
    public void djAdminClicksOnTheEditButton() {
        ReusableMethods.waitForSecond(1);
        ReusableMethods.jsClick(addDeanPage.deanEditButtonListDj.get(0));
    }

    @And("dj admin clicks on the gender female button")
    public void djAdminClicksOnTheGenderFemaleButton() {
        ReusableMethods.waitForSecond(1);
        //ReusableMethods.checkTheBox(deanPage.editDeanFemaleCheckBoxDj);
        addDeanPage.deanFemaleCheckBoxDj.click();
    }

    @And("dj admin fills the password box")
    public void djAdminFillsThePasswordBox() {
        ReusableMethods.waitForSecond(1);
        addDeanPage.deanPasswordBoxDj.sendKeys(
                ConfigReader.getProperty("Dean_password"));
    }

    @And("dj admin clicks on the submit button")
    public void djAdminClicksOnTheSubmitButton() {
        ReusableMethods.waitForSecond(1);
        addDeanPage.editDeanSubmitButtonDj.click();
    }

    @Then("dj admin verifies if the Dean Updated Successfully popup is displayed")
    public void djAdminVerifiesIfTheDeanUpdatedSuccessfullyPopupIsDisplayed() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(addDeanPage.deanEditedVerifyDj.isDisplayed());
        //Assert.assertTrue(deanPage.deanUpdatedSucDj.getText().contains("Dean updated Successful"));
    }

    @And("dj admin clicks on the edit-close X button")
    public void djAdminClicksOnTheEditCloseXButton() {
        ReusableMethods.clickOutside();
    }
}
