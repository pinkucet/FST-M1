package testscripts;

import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;
import basetest.BaseTest;
import pom.EmployeeDirectory;
import pom.LoginPage;

public class ProjectActivity6 extends BaseTest{

	@Test
	public static void Activity6() throws InterruptedException {
		try {
			LoginPage.login(driver);
			EmployeeDirectory.checkDirectory(driver);
			
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
