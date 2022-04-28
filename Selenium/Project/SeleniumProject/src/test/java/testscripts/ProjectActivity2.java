package testscripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pom.LoginPage;

public class ProjectActivity2 extends BaseTest{


	
	
	@Test
	public static void Activity2() {
		try {
			String headerURL = LoginPage.getHeaderURL(driver);
			System.out.println("URL for header image is:- "+headerURL);
			
		
		}catch (ElementNotInteractableException e) {
			
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
