package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity4_1 {
    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of webpage is "+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        Thread.sleep(2000);
        System.out.println("Title of About us webpage is "+driver.getTitle());
        driver.close();
    }
}
