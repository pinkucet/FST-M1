package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    //Declaring Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceId","228b3cb69904");
        cap.setCapability("platformName","android");
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appPackage","com.miui.calculator");
        cap.setCapability("appActivity",".cal.CalculatorActivity");
        cap.setCapability("noReset","true");

        //set server url
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Initialization
    driver = new AndroidDriver<MobileElement>(serverURL,cap);
    }

    @Test
    public void additionTest(){
        driver.findElementById("com.miui.calculator:id/btn_2_s").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("com.miui.calculator:id/btn_6_s").click();
        driver.findElementByAccessibilityId("equals").click();
        String result = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println(result);

        Assert.assertTrue(result.contains("8"), "Test Passed");

    }

    @AfterTest
    public void closeTest(){
        driver.quit();
    }


}
