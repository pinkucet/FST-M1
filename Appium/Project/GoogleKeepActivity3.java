package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeepActivity3 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceId","228b3cb69904");
        cap.setCapability("platformName","android");
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appPackage","com.google.android.keep");
        cap.setCapability("appActivity","com.google.android.keep.activities.BrowseActivity");
        cap.setCapability("noReset","true");

        //set server url
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Initialization
        driver = new AndroidDriver<MobileElement>(serverURL,cap);
    }

    @Test
    public void activity3(){
        //click on google keep button to add task
        driver.findElementByAccessibilityId("New text note").click();
        //adding a note
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
        MobileElement title = driver.findElementById("editable_title");
        title.sendKeys("This is a test title");
        driver.findElementById("edit_note_text").sendKeys("This is a test note");
        driver.findElementByAccessibilityId("Reminder").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Later today\")").click();
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("index_note_title")));
        String noteTitle = driver.findElementById("index_note_title").getText();
        Assert.assertTrue(noteTitle.equals("This is a test title"), "Test Passed- NOte title is present");
        String noteDesc = driver.findElementById("index_note_text_description").getText();
        Assert.assertTrue(noteDesc.equals("This is a test note"), "Test Passed - Note description is available");
        boolean reminder = driver.findElementById("reminder_chip_icon").isDisplayed();
        Assert.assertTrue(reminder, "Test Passed - Reminder option is displayed");


    }

    @AfterTest
    public void closeTest(){

        driver.quit();
    }
}
