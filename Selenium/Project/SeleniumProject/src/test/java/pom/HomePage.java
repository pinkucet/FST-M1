package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basetest.BaseTest;

public class HomePage extends BaseTest{
	
	private static final String dashboard = "//h1[text()='Dashboard']";
	
	public static String getTitle(WebDriver driver)  {
		return driver.getTitle();
		
	}
	
	public static boolean verifyHomepage(WebDriver driver) {
		return driver.findElement(By.xpath(dashboard)).isDisplayed();
	}

}
