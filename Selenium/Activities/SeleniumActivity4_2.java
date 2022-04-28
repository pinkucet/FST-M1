package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity4_2 {

    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of webpage is "+driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("First Name");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Last Name");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9890987820");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
