package management_on_school.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {

//--------------------------------------wait: HARD WAIT METHOD----------------------------------------------------------
    public static void waitForSecond(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//---------------------------------------waits: EXPLICIT WAIT METHODS----------------------------------------------------
    //Visible Wait for element
    public static void waitForVisibleElement(WebElement element, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //inVisible Wait for Element
    public static void waitForInVisible(WebElement element, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    //Visible Element Locator Wait
    public static WebElement waitForVisibleElementByLocator(By locator, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //Wait For Alert
    public static void waitForAlert(int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    // FluentWait ile List<WebElement
    public static void waitForList(List<WebElement> elements) {
        FluentWait<WebDriver> wait = new FluentWait<>(Driver.getDriver());
        wait.withTimeout(Duration.ofSeconds(40)).
                pollingEvery(Duration.ofMillis(200)).
                until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    //Url gelene kadar bekleme suresi tanimlanabilir
    public static boolean waitForUrlToBe(String url, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        return wait.until(ExpectedConditions.urlToBe(url));
    }

    // Check Element Contains Text ===> ASSERTION
    public static void checkTextContains(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        WebElement elementName = wait.until(ExpectedConditions.visibilityOf(element));
        if (elementName.getText().trim().contains(text.trim())) {
            Assert.assertTrue(true);
        } else
            Assert.fail(text + " değerini içeren element bulunamadı. Element text :" + elementName.getText());
    }

//-------------------------------------------ALERT HANDLES--------------------------------------------------------------
    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertPrompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }


//-----------------------------------ddm-SELECT-------------------------------------------------------------------------
    //DropDown VisibleText ile secer
    public static void ddmVisibleText(WebElement ddm, String optionText) {
        Select select = new Select(ddm);
        select.selectByVisibleText(optionText);
    }

    //DropDown Index ile secer
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value ile secer
    public static void ddmValue(WebElement ddm, String optionsValue) {
        Select select = new Select(ddm);
        select.selectByValue(optionsValue);
    }


//------------------------------CheckBox-------------------------------------------------------------------------------
    public static void checkTheBox(WebElement checkbox){
        if (!checkbox.isSelected()){
            checkbox.click();
        }
    }

//-------------------------------SwitchTo:  Window  / iframe ----------------------------------------------------------

    //SwitchToWindow : List seklinde tum windows handles'lari alir ve index no ile istedigimiz window'u getirir
    public static void switchToWindow(int number) {
        List<String> allWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(allWindowHandles.get(number));
    }

    //Switch to Iframe
    public static void switchToFrame(int index){
        Driver.getDriver().switchTo().frame(index);
    }

    //Iframe'den parent frame'e gecmek icin;
    public static void switchToParentFrame(){
        Driver.getDriver().switchTo().parentFrame();
    }

    //Iframe'den tamamen cikmak icin;
    public static void switchToDefaultContent(){
        Driver.getDriver().switchTo().defaultContent();
    }

//----------------------------------------- Screen Shots Methods --------------------------------------------------------

    //Tüm Sayfa ScreenShot
    public static void screenShot(String imgName, String yourName) {
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        String filePath = System.getProperty("user.dir") + "/TestOutput/screenshot/"
                +yourName + "_"+ imgName+ "_"+  date + ".png";
        try {
            Files.write(Paths.get(filePath),ts.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
    public static void screenShotOfWebElement(WebElement webElement, String imgName, String yourName){

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );
        String filePath = System.getProperty("user.dir") + "/TestOutput/webelementscreenshot/"
                +yourName + "_"+ imgName+ "_"+  date + ".png";
        try {
            Files.write(Paths.get(filePath),webElement.getScreenshotAs(OutputType.BYTES) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//--------------------------------------------WebTable-------------------------------------------------------------------

    //WebTable
    public static void printDataFromTable(int tableNo, int row, int column) {
        WebElement rowAndColumn = Driver.getDriver().findElement(By.xpath("//table["+tableNo+"]//tbody//tr["+row+"]//td["+column+"]"));
        System.out.println("rowAndColumn Data: "+ rowAndColumn.getText());
        System.out.println(rowAndColumn.getText());
    }

//--------------------------------------------JS Executor Methods--------------------------------------------------------
    // JS Executor Click Method
    public static void jsClick(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS Sayfa Sonu Scroll
    public static void jsScrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void jsScrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS Executor SendKeys
    public static void jsSendKeys(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SetAttributeValue
    public static void jsSetAttribute(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void jsGetValueBy(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }

    //Clean By JS
    public static void jsCleanBy(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value = '';", element);
    }


    //Cikan reklamlarin disina tiklayarak reklami otomatik kapatir
    public static void clickOutside() {  //reklam savar
        try {
            Actions action = new Actions(Driver.getDriver());
            action.moveByOffset(0, 0).click().build().perform();
        } catch (Exception e) {

        }
    }














































//===================299: Ortak Methods Sonu / Kisilere ait Methods Baslangici ==========================================
    // 1. kisi satir Baslangici: 300/ satir sonu: 319)
























}
