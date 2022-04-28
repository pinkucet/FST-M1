package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basetest.BaseTest;

public class EmployeeDirectory extends BaseTest {
	
	
	private static final String directory = "//a[contains(@id,'Directory')]";
	private static final String directoryHeader = "//a[contains(@class,'toggle')]";
	
	
	public static void checkDirectory(WebDriver driver) {
		if(driver.findElement(By.xpath(directory)).isDisplayed()) {
			driver.findElement(By.xpath(directory)).click();
			System.out.println("Directory clicked");
			
		}
		if(driver.findElement(By.xpath(directoryHeader)).isDisplayed()) {
			System.out.println("Directory header available");
		}
	}

}
