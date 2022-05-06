package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException, MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "228b3cb69904");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.miui.calculator");
        caps.setCapability("appActivity",".cal.CalculatorActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void add() {
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_plus_s").click();
        driver.findElementById("btn_9_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        Assert.assertEquals(result, "= 14");
    }

    @Test
    public void subtract() {

        driver.findElementById("btn_c_s").click();
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_minus_s").click();
        driver.findElementById("btn_5_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        Assert.assertEquals(result, "= 5");
    }

    @Test
    public void multiply() {
        driver.findElementById("btn_c_s").click();
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_mul_s").click();
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_0_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        Assert.assertEquals(result, "= 500");
    }

    @Test
    public void divide() {
        driver.findElementById("btn_c_s").click();
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_div_s").click();
        driver.findElementById("btn_2_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        Assert.assertEquals(result, "= 25");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
