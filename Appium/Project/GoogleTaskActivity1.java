package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleTaskActivity1 {

    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceId","228b3cb69904");
        cap.setCapability("platformName","android");
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appPackage","com.google.android.apps.tasks");
        cap.setCapability("appActivity",".ui.TaskListsActivity");
        cap.setCapability("noReset","true");

        //set server url
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Initialization
        driver = new AndroidDriver<MobileElement>(serverURL,cap);
    }

    @Test
    public void activity1(){
        //click on google task button to add task
        driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();
        //adding Complete Activity with Google Tasks
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        MobileElement taskBox = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        taskBox.sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        String activityName = driver.findElementById("com.google.android.apps.tasks:id/task_name").getText();
        Assert.assertTrue(activityName.equals("Complete Activity with Google Tasks"), "Test Passed");

        //adding Complete Activity with Google Keep
        driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.google.android.apps.tasks:id/task_name")));
        activityName = driver.findElementById("com.google.android.apps.tasks:id/task_name").getText();
        Assert.assertTrue(activityName.equals("Complete Activity with Google Keep"), "Test Passed");

        //adding Complete the second Activity Google Keep
        driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.google.android.apps.tasks:id/task_name")));
        activityName = driver.findElementById("com.google.android.apps.tasks:id/task_name").getText();
        Assert.assertTrue(activityName.equals("Complete the second Activity Google Keep"), "Test Passed");

    }

    @AfterTest
    public void closeTest(){

        driver.quit();
    }
}
