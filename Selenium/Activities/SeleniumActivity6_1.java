package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumActivity6_1 {

    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of webpage is "+driver.getTitle());
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        System.out.println("Checkbox displayed " +checkBox.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.invisibilityOf(checkBox));
        System.out.println("Checkbox displayed " +checkBox.isDisplayed());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(checkBox));
        driver.close();
    }
}
