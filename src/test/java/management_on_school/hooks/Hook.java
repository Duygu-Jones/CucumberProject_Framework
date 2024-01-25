package management_on_school.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import management_on_school.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

import static management_on_school.base_url.BaseUrl.*;


public class Hook {

    @Before("@UI")
    public void setup(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

    @After("@UI")
    public void tearDown(){
        Driver.closeDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
        Driver.closeDriver();

    }

    //--------------------------------------------------------------------------------------------------------------------------
    @Before("@admin")
    public void beforeApiAdmin() {
        System.out.println("Before Method for admin");
        adminSetup();

    }
    @Before("@dean")
    public void beforeApiDean() {
        System.out.println("Before Method for dean");
        deanSetup();

    }
    @Before("@vicedean")
    public void beforeApiViceDean() {
        System.out.println("Before Method for vicedean");
        viceDeanSetup();

    }
    @Before("@teacher")
    public void beforeApiTeacher() {
        System.out.println("Before Method for teacher");
        teacherSetup();

    }
    @Before("@student")   //---> @Tag lar .feature file lara eklenecek sadece.
    public void beforeApiStudent(){
        System.out.println("Before method for student");
        studentSetup();
//        Driver.getDriver().get(ConfigReader.getProperty("manage_url"));
//        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        Driver.getDriver().manage().window().maximize();

    }

//--------------------------------------------------------------------------------------------------------------------------




}
