package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity5_1 {

    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of webpage is "+driver.getTitle());
        System.out.println("Checkbox displayed " +driver.findElement(By.xpath("//input[@class='willDisappear']"))
                .isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Checkbox displayed " +driver.findElement(By.xpath("//input[@class='willDisappear']"))
                .isDisplayed());
        driver.close();
    }
}

