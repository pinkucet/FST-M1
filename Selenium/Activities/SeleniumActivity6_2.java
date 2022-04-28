package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumActivity6_2 {

    public static void main(String ...args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of webpage is "+driver.getTitle());
        driver.findElement(By.className("violet")).click();
        WebElement helloMsg = driver.findElement(By.xpath("//h1[text()='HELLO!']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(helloMsg));
        WebElement lateMsg = driver.findElement(By.xpath("//h1[text()='HELLO!']/following-sibling::h3"));
        wait.until(ExpectedConditions.visibilityOf(lateMsg));
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
        driver.close();
    }
}
