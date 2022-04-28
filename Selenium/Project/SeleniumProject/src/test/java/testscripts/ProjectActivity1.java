package testscripts;
import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;
import basetest.BaseTest;
import pom.HomePage;
import pom.LoginPage;

public class ProjectActivity1 extends BaseTest{
	
	
	@Test
	public static void Activity1() throws InterruptedException {
		try {
			LoginPage.login(driver);
			String title = HomePage.getTitle(driver);
			if(title.equals("OrangeHRM")) {
				Assert.assertTrue(true,"Title matched");
			}else {
				Assert.assertTrue(false,"Title not matched");
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
