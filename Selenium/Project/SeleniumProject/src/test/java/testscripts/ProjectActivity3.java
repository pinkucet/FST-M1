package testscripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pom.HomePage;
import pom.LoginPage;

public class ProjectActivity3 extends BaseTest{
	@Test
	public static void Activity3() throws InterruptedException {
		try {
			LoginPage.login(driver);
			if(HomePage.verifyHomepage(driver)) {
				System.out.println("Landed on correct page");
			}else {
				System.out.println("Login not successful");
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}catch (ElementNotInteractableException e) {
			
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
