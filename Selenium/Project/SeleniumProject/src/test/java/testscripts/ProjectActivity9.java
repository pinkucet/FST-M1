package testscripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pom.EmergencyContact;
import pom.LoginPage;

public class ProjectActivity9 extends BaseTest{
	
	@Test
	public static void Activity9() throws InterruptedException {
		try {
			LoginPage.login(driver);
			EmergencyContact.clickOnMyInfo(driver);
			EmergencyContact.printEmergencyContact(driver);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}catch (ElementNotInteractableException e) {
			
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			
			e.printStackTrace();
			throw new RuntimeException("Element not found");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
