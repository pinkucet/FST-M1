package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity2 {
    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of webpage is "+driver.getTitle());
        System.out.println("Getting Text using ID locator "+driver.findElement(By.id("about-link")).getText());
        System.out.println("Getting Text using class name locator "+driver.findElement(By.
                className("huge")).getText());
        System.out.println("Getting Text using link text locator "+driver.findElement(By.linkText("About Us")).getText());
        System.out.println("Getting Text using css selector locator "+driver.findElement(By.cssSelector("a#about-link")).getText());
        Thread.sleep(2000);
        driver.close();
    }
}
