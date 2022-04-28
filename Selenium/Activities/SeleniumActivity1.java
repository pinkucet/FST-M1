package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity1 {

public static void main(String ...args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.training-support.net");
    Thread.sleep(2000);
    driver.close();
}
}
