package management_on_school.pages;

import management_on_school.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class AddDeanPage {
    public AddDeanPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@href='/login']") public WebElement loginLink;
    @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButton;
    @FindBy(xpath = "//a[text()='Dean Management']") public WebElement deanManagementButton;
    @FindBy(xpath = "//a[text()='Teacher Management']") public WebElement teacherManagementButton;
    @FindBy(xpath = "//a[text()='Meet Management']") public WebElement meetManagementButton;
    @FindBy(xpath = "//a[text()='Guest User']") public WebElement guestUserButton;
    @FindBy(xpath = "//div[@class='offcanvas offcanvas-start show']/div[@class='offcanvas-body']") public WebElement mainMenueBodyForStudent;
    @FindBy(id = "username") public WebElement usernameBox;
    @FindBy(id = "password") public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement loginButton;
    @FindBy(id = "name") public WebElement name;
    @FindBy(id = "surname") public WebElement surname;
    @FindBy(id = "birthPlace") public WebElement birthPlace;
    @FindBy(xpath = "//input[@value='FEMALE']") public WebElement genderFemale;
    @FindBy(xpath = "//input[@value='MALE']") public WebElement genderMale;
    @FindBy(id = "birthDay") public WebElement birthDay;
    @FindBy(id = "phoneNumber") public WebElement phoneNumber;
    @FindBy(id = "ssn") public WebElement ssn;
    @FindBy(id = "username") public WebElement username;
    @FindBy(id = "password") public WebElement deanPassword;
    @FindBy(xpath ="//div[@class='Toastify__toast-body']/div[.='Dean Saved']") public WebElement deanSavedPopUp;
    @FindBy (css = ".btn-primary") public WebElement deanSubmit;
    @FindBy (xpath = "(//input[@placeholder='Name'])[2]") public WebElement editDeanName;
    @FindBy (xpath = "(//input[@placeholder='Surname'])[2]") public WebElement editDeanSurName;
    @FindBy (xpath = "(//input[@placeholder='Birth Place'])[2]") public WebElement editDeanBirthPlace;
    @FindBy (xpath = "(//input[@name='gender'])[3]") public WebElement editDeanGender;
    @FindBy (xpath = "(//input[@id='birthDay'])[2]") public WebElement editDeanBirthDay;
    @FindBy (xpath = "(//input[@placeholder='Phone Number'])[2]") public WebElement editDeanPhone;
    @FindBy (xpath = "(//input[@placeholder='username'])[2]") public WebElement editDeanUserName;
    @FindBy (xpath = "(//input[@placeholder='Password'])[2]") public WebElement editDeanPassword;
    @FindBy (xpath = "(//div[@class='modal-footer']/button[@class='fw-semibold btn btn-primary btn-lg'])") public WebElement editDeanSubmit;
    @FindBy (xpath = "//div[@class='modal-footer']/button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement deanUpdatedUyari;
    @FindBy (xpath ="//form[1]/div[@class='row']/div[1]//div[@class='invalid-feedback']") public WebElement deanNameRequired;
    @FindBy (xpath ="//form[1]//div[2]//div[@class='invalid-feedback']") public WebElement deanSurNameRequired;
    @FindBy (xpath ="//form[1]//div[3]//div[@class='invalid-feedback']") public WebElement deanBirthPlaceBoxRequired;
    @FindBy (xpath ="//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot coerce empty String (\"\") to `com.project.schoolmanagmen')]") public WebElement deanGenderBoxRequired;
    @FindBy (xpath ="//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot deserialize value of type `java.time.LocalDate` from St')]") public WebElement deanDateOfBirthBoxRequired;
    @FindBy (xpath ="//div[@class='Toastify__toast-body']/div[.='Please enter valid phone number']") public WebElement deanPhoneNumberBoxRequired;
    @FindBy (xpath ="//div[@class='Toastify__toast-body']/div[.='Please enter valid SSN number']") public WebElement deanSSNBoxRequired;
    @FindBy (xpath ="//div[.='Required']") public WebElement deanUserNameBoxRequired;
    @FindBy (xpath ="//div[.='Minimum 8 character']") public WebElement deanPasswordBoxRequired;
    @FindBy (xpath ="//th[.='Name']") public WebElement deanListName;
    @FindBy (xpath ="//th[.='Gender']") public WebElement deanListGender;
    @FindBy (xpath ="//th[.='Phone Number']") public WebElement deanListPhone;
    @FindBy (xpath ="//th[.='Ssn']") public WebElement deanListSSN;
    @FindBy (xpath ="//th[.='User Name']") public WebElement deanListUserName;
    @FindBy (xpath ="//h5[.='Dean List']") public WebElement deanListisDisplayed;
    @FindBy (xpath ="//tr[6]//button[@class='text-dark btn btn-outline-info']") public WebElement deanListEdit;
    @FindBy (xpath ="//a[.='»Last']") public WebElement deanListSonSayfa;
    @FindBy (xpath ="//tr[last()]//button[@class='text-dark btn btn-outline-info']") public WebElement deanListEditButton;
    @FindBy(xpath = "//table//tr[last()]//td[1]") public WebElement tabloNameEnSonHucre;
    @FindBy(xpath = "//table//tr[last()]//td[6]") public WebElement tabloEnSonHucreedit;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your name must consist of the characters .']") public WebElement nameKarakterIcermeliPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your surname must consist of the characters .']") public WebElement surNameKarakterIcermeliPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your name should be at least 2 characters']") public WebElement deanNameEnAzIkiKarakterIcermeliPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your birth place must consist of the characters .']") public WebElement birthPlaceKarakterIcermeliPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your surname should be at least 2 characters']") public WebElement surNameEnAzIkiKarakterIcermeliPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Your birth place should be at least 2 characters']") public WebElement birthPlaceEnAzIkiKarakterIcermeliPopUp;



























    // Duygu Jones (100)

    //--> Dean Management Page
    @FindBy(xpath = "//h5[.='Dean List']")   public WebElement deanListTitleDj;
    @FindBy(xpath = "//h3[@bg='primary']")   public WebElement deanManagementTitleDj;
    @FindBy(xpath = "(//*[@class='page-link'])[5]")   public WebElement deanLastPageIconDj;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[1]")
    public List<WebElement> deanNamesListDj;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[2]")
    public List<WebElement> deanGenderListDj;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[3]")
    public List<WebElement> deanPhoneListDj;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[4]")
    public List<WebElement> deanSsnNumsListDj;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[5]")
    public List<WebElement> deanUserNamesListDj;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])")
    public List<WebElement> deanEditButtonListDj;

    //--> Dean Add/Edit locators
    @FindBy(id="name")   public WebElement deanNameBoxDj;
    @FindBy(id="surname")   public WebElement deanSurnameBoxDj;
    @FindBy(id="birthPlace")   public WebElement deanBirthPlaceBoxDj;
    @FindBy(xpath="//input[@value='FEMALE']")   public WebElement deanFemaleCheckBoxDj;
    @FindBy(xpath="//input[@value='MALE']")   public WebElement deanMaleCheckBoxDj;
    @FindBy(id="birthDay")   public WebElement deanBirthDateBoxDj;
    @FindBy(id="phoneNumber")   public WebElement deanPhoneBoxDj;
    @FindBy(id="ssn")   public WebElement deanSsnBoxDj;
    @FindBy(id="username")   public WebElement deanUsernameBoxDj;
    @FindBy(id="password")   public WebElement deanPasswordBoxDj;
    @FindBy(xpath="(//button[.='Submit'])[2]")   public WebElement editDeanSubmitButtonDj;
    @FindBy(css="#root") public WebElement deanEditedVerifyDj;
    @FindBy(css = ".btn-primary") public WebElement addDeanSubmitButtonDj;
    @FindBy(xpath="//div[@class='Toastify__toast-body']/div[.='Dean Saved']")  public WebElement deanSavedVerifyDj;
    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")  public WebElement nameRequiredVerifyDj;  //name required text locate
    @FindBy(xpath="//div[@class='Toastify__toast-body']/div[.='Please enter valid SSN number']")  public WebElement ssnRequiredVerifyDj;
     @FindBy(xpath="(//div[@class='invalid-feedback'])[8]")  public WebElement unValidPasswordVerifyDj;































































































    //Salih Kaygusuz (200)



































































































    //Yakup Aydin (300)



































































































    //Kubra Cemrek (400)



































































































    //Mehmet Ergan (500)



































































































    // Halil Uslu (600)



































































































    // Mustafa Aydin (700)



































































































    // Kubra Unver (800)



































































































    // Isra Muncester (900)



































































































}