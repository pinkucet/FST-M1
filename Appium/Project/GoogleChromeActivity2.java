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

public class GoogleChromeActivity2 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceId","228b3cb69904");
        cap.setCapability("platformName","android");
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appPackage","com.android.chrome");
        cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
        cap.setCapability("noReset","true");

        //set server url
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Initialization
        driver = new AndroidDriver<MobileElement>(serverURL,cap);
    }

    @Test
    public void activity2ValidLogin() throws InterruptedException {
        //navigating to URL
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable( new UiSelector().scrollable(true))";

        driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollForward(2).scrollTextIntoView(\"Login Form\")").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByAndroidUIAutomator(("text(\"Sign in! Welcome Back!\")"))));
        //Adding Task
        driver.findElementByAndroidUIAutomator("resourceId(\"username\")").sendKeys("admin");
        driver.findElementByAndroidUIAutomator("resourceId(\"password\")").sendKeys("password");
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Log in\")")).click();
        String confMSG = driver.findElementByAndroidUIAutomator("resourceId(\"action-confirmation\")").getText();
        if(confMSG.equals("Welcome Back, admin")){
            System.out.println("Logged in with valid Credential");
        }
        Assert.assertEquals(confMSG,"Welcome Back, admin","validation passed");



    }
@Test
    public void activity2InValidLogin() throws InterruptedException {
        //navigating to URL
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable( new UiSelector().scrollable(true))";

        driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollForward(2).scrollTextIntoView(\"Login Form\")").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByAndroidUIAutomator(("text(\"Sign in! Welcome Back!\")"))));
        //Adding Task
        driver.findElementByAndroidUIAutomator("resourceId(\"username\")").sendKeys("admin1");
        driver.findElementByAndroidUIAutomator("resourceId(\"password\")").sendKeys("password");
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Log in\")")).click();
        String confMSG = driver.findElementByAndroidUIAutomator("resourceId(\"action-confirmation\")").getText();
        if(confMSG.equals("Welcome Back, admin")){
            System.out.println("Logged in with valid Credential");
        }else{
            System.out.println("Logged in with Invalid Credential");
        }
        Assert.assertEquals(confMSG,"Invalid Credentials","validation passed");
    }

    @AfterTest
    public void closeTest(){

        driver.quit();
    }
}
