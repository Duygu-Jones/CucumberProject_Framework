package management_on_school.pages;

import management_on_school.utilities.ConfigReader;
import management_on_school.utilities.Driver;
import management_on_school.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;














public class ViceDeanPage {
    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }







































































  
    // Duygu Jones (100)



































































































    //Salih Kaygusuz (200)
    public void performLoginVD() {
        Actions actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
        ReusableMethods.waitForSecond(3);
        homePageLoginLinkVD_ST.click();
        userNameButtonVD_ST.sendKeys("gakky87VD");
        PasswordButtonVD_ST.sendKeys("Cavabunga82");
        homePageLoginButtonVD_ST.click();



    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")         public WebElement homePageLoginLinkVD_ST;
    @FindBy(xpath = "//input[@id='username']")         public WebElement userNameButtonVD_ST;
    @FindBy(xpath = "//input[@id='password']")         public WebElement PasswordButtonVD_ST;
    @FindBy(xpath = "//button[normalize-space()='Login']")         public WebElement loginPageLoginButtonVD_ST;
    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement PageMenuButtonVD_ST;
    @FindBy(xpath = "//a[normalize-space()='Student Management']")
    public WebElement mainMenuStudentManagementButtonVD_ST;
    @FindBy(xpath = "//select[@id='advisorTeacherId']")         public WebElement advisorTeacherDropDownButtonVD_ST;
    @FindBy(id = "name")         public WebElement studentMngNamenBoxVD_ST;
    @FindBy(id = "surname")         public WebElement studentMngSurnamenBoxVD_ST;
    @FindBy(id = "birthPlace")         public WebElement studentMngBPlaceBoxVD_ST;
    @FindBy(id = "email")         public WebElement studentMngemailBoxVD_ST;
    @FindBy(id = "phoneNumber")         public WebElement studentMngPhoneBoxVD_ST;
    @FindBy(id = "ssn")         public WebElement studentMngSsnBoxVD_ST;
    @FindBy(id = "username")         public WebElement studentMngUserNameBoxVD_ST;
    @FindBy(id = "fatherName")         public WebElement studentMngFatherNameBoxVD_ST;
    @FindBy(id = "motherName")         public WebElement studentMngMotherNameBoxVD_ST;
    @FindBy(id = "password")         public WebElement studentMngPasswordBoxVD_ST;
    @FindBy(xpath = "//input[@value='MALE']")         public WebElement studentMngGenderMaleButtonVD_ST;
    @FindBy(xpath = "//input[@value='FEMALE']")         public WebElement studentMngGenderFeMaleButtonVD_ST;

    @FindBy(xpath = "//div[contains(text(),'Student saved Successfully')]")         public WebElement studentMngSuccessfullyVD_ST;
    @FindBy(xpath = "//button[normalize-space()='Submit']")         public WebElement studentMngSubmitButtonVD_ST;
    @FindBy(xpath = "//div[normalize-space()='Required']")         public WebElement studentMngNameRequiredTesxtVD_ST;
    @FindBy(css = "div[role='alert'] div:nth-child(2)")         public WebElement studentMngPleaseEnterValidEmailTesxtVD_ST;
    @FindBy(xpath = "//div[contains(text(),'You have entered an invalid value. Valid values ar')]")         public WebElement studentMngGenderIvalidValueTesxtVD_ST;
    @FindBy(id = "birthDay")         public WebElement studentMngBirthdayBoxVD_ST;



    @FindBy(xpath = "//div[normalize-space()='Minimum 11 character (XXX-XX-XXXX)']")         public WebElement studentMngSsnInvalidValueTextVD_ST;
    @FindBy(xpath = "//div[3]//div[2]//div[1]//div[1]")         public WebElement studentMngUserNameInvalidValueTextVD_ST;
    @FindBy(xpath = "//div[normalize-space()='At least 8 characters']")         public WebElement studentMngPas8CaharcterInvalidValueTextVD_ST;
    @FindBy(xpath = "//div[normalize-space()='One uppercase character']")         public WebElement studentMngPasUpperCaseInvalidValueTextVD_ST;
    @FindBy(xpath = "//div[normalize-space()='One lowercase character']")         public WebElement studentMngPasLowerCaseInvalidValueTextVD_ST;
    @FindBy(xpath = "//div[normalize-space()='One number']")         public WebElement studentMngPasOneNumberInvalidValueTextVD_ST;
    @FindBy(xpath = "//button[normalize-space()='Login']")         public WebElement homePageLoginButtonVD_ST;
    @FindBy(xpath = "//a[normalize-space()='Logout']")         public WebElement logoutVD_ST;
















































    //Yakup Aydin (300)



































































































    //Kubra Cemrek (400)
    @FindBy(css = ".header_link.ms-2") public WebElement loginBtnHomeKubraC;
    @FindBy(id= "username") public WebElement userNameKubraC;
    @FindBy(id= "password") public WebElement passwordKubraC;
    @FindBy(css= ".fw-semibold.btn.btn-primary") public WebElement loginButtonKubraC;
    @FindBy(id= "controlled-tab-example-tab-lessonProgram") public WebElement lessonProgramKubraC;
    @FindBy(xpath= "(//tr)[33]") public WebElement lessonProgramListKubraC;
    @FindBy(id = "react-select-2-input") public WebElement chooseLessonClickKubraC;
    @FindBy(id = "educationTermId") public WebElement eduTimeKubraC;
    @FindBy(id = "day") public WebElement chooseDayKubraC;
    @FindBy(id = "startTime") public WebElement startTimeKubraC;
    @FindBy(id = "stopTime") public WebElement stopTimeKubraC;
    @FindBy(xpath = "(//input[@id = 'lessonProgramId'])[1]") public WebElement selectLessonKubraC;
    @FindBy(id = "teacherId") public WebElement selectTeacherKubraC;
    @FindBy(xpath = "(//button[@class = 'fw-semibold btn btn-primary btn-lg'])[4]") public WebElement submitTeacherKubraC;
    @FindBy(xpath = "//div[text() = 'Lesson added to Teacher']") public WebElement verifyAddedTeacKubraC;
    @FindBy(xpath = "//div[text() = 'Created Lesson Program']") public WebElement verifyCreatedLessonKubraC;




























































































    //Mehmet Ergan (500)



































































































   // Halil Uslu (600)
   @FindBy(xpath = "//*[@href='/login']") public WebElement loginLink_hu;
   @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButton_hu;
    @FindBy(xpath = "//a[text()='Teacher Management']") public WebElement teacherManagementButton_hu;
    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']") public WebElement selectLesson_ok_hu;
    @FindBy(xpath = "//div[contains(@class,'css-19bb58m')]") public WebElement selectLesson_hu;
    @FindBy(xpath = "//div[@class=' css-9jq23d']") public WebElement javaScript_hu;
    @FindBy(xpath = "//input[@id='name']") public WebElement name_hu;
    @FindBy(xpath = "//input[@id='surname']") public WebElement surName_hu;
    @FindBy(xpath = "//input[@id='birthPlace']") public WebElement birthPlace_hu;
    @FindBy(xpath = "//input[@id='email']") public WebElement email_hu;
    @FindBy(xpath = "//input[@id='phoneNumber']") public WebElement phoneNumber_hu;
    @FindBy(xpath = "//input[@id = 'isAdvisorTeacher']") public WebElement isAdvisorTeacher_hu;
    @FindBy(xpath = "//input[@value='FEMALE']") public WebElement femaleButton_hu;
    @FindBy(xpath = "//input[@value='MALE']") public WebElement maleButton_hu;
    @FindBy(xpath = "//input[@id = 'birthDay']") public WebElement birthDay_hu;
    @FindBy(xpath = "//input[@id = 'ssn']") public WebElement ssnBox_hu;
    @FindBy(xpath = "//input[@id = 'username']") public WebElement usernameBox_hu;
    @FindBy(xpath = "//input[@id = 'password']") public WebElement passwordBox_hu;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement SubmitButton_hu;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement loginButton_hu;
    @FindBy(xpath = "//a[text()='Dean Management']") public WebElement deanManagementButton_hu;
    @FindBy(xpath ="//div[contains(text(),'Teacher saved successfully')]") public WebElement SavedPopUp_hu;
    @FindBy(xpath = "//input[@role='combobox']") public WebElement chooseLesson_hu;
    @FindBy(xpath = "//div[normalize-space()='At least 8 characters']") public WebElement AtLeast8Characters_hu;
    @FindBy(xpath = "//div[normalize-space()='One uppercase character']") public WebElement OneUppercaseCharacter_hu;
    @FindBy(xpath = "//div[normalize-space()='One lowercase character']") public WebElement OneLowercaseCharacter_hu;
    @FindBy(xpath = "//div[normalize-space()='One number']") public WebElement OneNumber_hu;








































































   // Mustafa Aydin (700)



































































































   // Kubra Unver (800)



































































































   // Isra Muncester (900)



































































































}