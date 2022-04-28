package testscripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pom.ApplyLeave;
import pom.LoginPage;

public class ProjectActivity8 extends BaseTest{

	@Test
	public static void Activity8() throws InterruptedException {
		try {
			LoginPage.login(driver);
			ApplyLeave.clickOnApplyLeave(driver);
			ApplyLeave.EnterLeaveDetails(driver, "12_Apr_2022", "13_Apr_2022");
			ApplyLeave.verifyLeave(driver);
			
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
