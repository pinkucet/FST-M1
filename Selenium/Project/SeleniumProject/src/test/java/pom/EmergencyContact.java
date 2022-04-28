package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.BaseTest;

public class EmergencyContact extends BaseTest{
	
	private static final String myInfo = "//a[@id='menu_pim_viewMyDetails']";
	private static final String emergencyContact = "//ul[@id='sidenav']//a[text()='Emergency Contacts']";
	private static final String emergencyContactnumber = "//table[@id='emgcontact_list']/tbody/tr/td[5]";
	private static final String emergencyContactHeader = "//h1[text()='Assigned Emergency Contacts']";
	
	public static void clickOnMyInfo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(myInfo)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(emergencyContact)).click();
		

		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.
				findElement(By.xpath(emergencyContactHeader))));
		
	}
	
	public static void printEmergencyContact(WebDriver driver) {
		List<WebElement>list = driver.findElements(By.xpath(emergencyContactnumber));
		System.out.print("Emergency Contact numbers are ");
		for(WebElement ele:list) {
			System.out.print(ele.getText()+"\t");
		}
	}

}
