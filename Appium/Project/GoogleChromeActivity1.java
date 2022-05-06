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

public class GoogleChromeActivity1 {
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
    public void activity1() throws InterruptedException {
        //navigating to URL
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable( new UiSelector().scrollable(true))";

        driver.findElementByAndroidUIAutomator(UiScrollable + ".scrollForward(2).scrollTextIntoView(\"To-Do List\")").click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(("text(\"Add Task\")"))));
        //Adding Task
        driver.findElementByAndroidUIAutomator("resourceId(\"taskInput\")").sendKeys("Tsk1");
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();
        driver.findElementByAndroidUIAutomator("resourceId(\"taskInput\")").sendKeys("Tsk2");
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();

        int taskCount = driver.findElementsByAndroidUIAutomator("textContains(\"Tsk\")").size();
        System.out.println("Task count is " +taskCount);
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Tsk1\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Tsk2\")")).click();
        System.out.println("Task striked " );
        Thread.sleep(2000);
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"\uF1F8\")")).click();
        taskCount = driver.findElementsByAndroidUIAutomator("textContains(\"Tsk\")").size();
        System.out.println("Task count post clear list " +taskCount);
        Assert.assertEquals(taskCount,0,"Task count not matched");



    }

    @AfterTest
    public void closeTest(){

        driver.quit();
    }
}
