package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity5_3 {
    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of webpage is "+driver.getTitle());
        System.out.println("Input box Enabled " +driver.findElement(By.xpath("//input[@id='input-text']"))
                .isEnabled());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        System.out.println("Input box Enabled  " +driver.findElement(By.xpath("//input[@id='input-text']"))
                .isEnabled());
        driver.close();
    }
}
