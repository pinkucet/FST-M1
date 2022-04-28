package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity11_2 {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Click the button to open a simple alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert alert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);

        //Close the alert with OK
        alert.accept();
        //Close the Browser
        driver.close();
    }
}
