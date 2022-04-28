package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basetest.BaseTest;

public class LoginPage extends BaseTest  {
	
	private static final String userName = "//input[@id='txtUsername']";
	private static final String password = "input#txtPassword";
	private static final String loginButton = "input#btnLogin";
	private static final String headerLogo ="//div[@id='divLogo']/img";
	
	public static void login(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath(userName)).sendKeys(System.getenv("username"));
		driver.findElement(By.cssSelector(password)).sendKeys(System.getenv("password"));
		driver.findElement(By.cssSelector(loginButton)).click();
		Thread.sleep(2000);
		
		
		
	}
	
	public static String getHeaderURL(WebDriver driver) {
		String title =  driver.findElement(By.xpath(headerLogo)).getAttribute("src");
		return title;
	}
	
	
	

}
