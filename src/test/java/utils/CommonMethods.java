package utlis;

<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
=======
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
>>>>>>> a373050 (Oct30)
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
<<<<<<< HEAD
import utils.ConfigReader;
import utils.Constants;
import utils.PageInitializer;

import java.time.Duration;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver; // the driver instance is common through out the project
    public static void openBrowserAndLaunchApplication(){
//        read the property file
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
//        we are reading the key browser from the property file
        switch (ConfigReader.getPropertyValue("browser")){
=======

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonMethods extends utlis.PageInitializers {
    public static WebDriver driver; // the driver instance is common through out the project
    public static void openBrowserAndLaunchApplication(){
//        read the property file

        utlis.ConfigReader.readProperties(utlis.Constants.CONFIGURATION_FILEPATH);
//        we are reading the key browser from the property file
        switch (utlis.ConfigReader.getPropertyValue("browser")){
>>>>>>> a373050 (Oct30)
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("invalid browser name");
        }
        driver.manage().window().maximize();
<<<<<<< HEAD
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
=======
        driver.get(utlis.ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utlis.Constants.IMPLICIT_WAIT));
>>>>>>> a373050 (Oct30)
        initializePageObjects();
    }

    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);
    }


    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver,
<<<<<<< HEAD
                Duration.ofSeconds(Constants.EXPLICIT_WAIT));
=======
                Duration.ofSeconds(utlis.Constants.EXPLICIT_WAIT));
>>>>>>> a373050 (Oct30)
        return wait;
    }

    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();", element);
    }
<<<<<<< HEAD


=======
    public void closeBrowser(){
        driver.quit();
    }

    //take sc method for capturing all the sc
    //take screenshot method for capturing all the screenshots
    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        //in cucumber screenshot should be taken in array of byte format
        //since the size of the image is in byte, that's why the return type of this
        //method is array of byte
        byte[] picByte = ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        //we will pass the path of ss from constants class
        try {
            FileUtils.copyFile
                    (sourceFile, new File
                            (utlis.Constants.SCREENSHOT_FILEPATH +
                                    fileName+" "+
                                    getTimeStamp("yyyy-MM-dd-HH-mm-ss")
                                    +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picByte;
    }


    public static String getTimeStamp(String pattern){
        Date date = new Date();
        //after getting the date, I need to format it as per my requirement
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        //it will return the formatted date as per the pattern in string format
        return sdf.format(date);
    }
>>>>>>> a373050 (Oct30)
}