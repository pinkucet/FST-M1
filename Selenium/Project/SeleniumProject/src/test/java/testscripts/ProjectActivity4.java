package testscripts;

import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;
import basetest.BaseTest;
import pom.LoginPage;
import pom.PIM;

public class ProjectActivity4 extends BaseTest{
	
	@Test
	public static void Activity4() throws InterruptedException {
		try {
			LoginPage.login(driver);
			PIM.clickOnPIM(driver);
			PIM.addEmployee(driver);
			PIM.enterData(driver);
			PIM.saveEmployee(driver);
			PIM.verifyEmpCreation(driver);
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
