package management_on_school.pages;

import management_on_school.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;















public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }












































































    // Duygu Jones (100)
    @FindBy(xpath="//a[@href='/login']")      public WebElement loginMainDj;
    @FindBy(xpath = "//*[@id='username']")    public WebElement usernameDj;
    @FindBy(xpath="//*[@id='password']")    public WebElement passwordDj;
    @FindBy(xpath = "(//*[@type='button'])[3]")    public WebElement loginButtonDj;
    @FindBy(xpath = "(//*[@type='button'])[1]")    public WebElement menuButtonDj;

































































































    //Salih Kaygusuz (200)



































































































    //Yakup Aydin (300)



































































































    //Kubra Cemrek (400)



































































































    //Mehmet Ergan (500)



































































































    // Halil Uslu (600)



































































































    // Mustafa Aydin (700)



































































































    // Kubra Unver (800)



































































































    // Isra Muncester (900)



































































































}