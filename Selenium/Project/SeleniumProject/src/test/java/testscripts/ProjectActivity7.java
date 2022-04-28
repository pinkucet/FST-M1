package testscripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pom.AddEmpQualification;
import pom.LoginPage;

public class ProjectActivity7 extends BaseTest{
	
	@Test
	public static void Activity7() throws InterruptedException {
		try {
			LoginPage.login(driver);
			AddEmpQualification.clickOnMyInfo(driver);
			AddEmpQualification.addExperience(driver, "20_Jul_2011", "20_Jun_2021");
			
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
