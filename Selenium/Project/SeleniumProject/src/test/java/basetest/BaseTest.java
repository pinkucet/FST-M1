package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriver getBrowser(String browserName){
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
			driver = new FirefoxDriver();
		}
	    return driver;
	}
	
	@BeforeMethod
	public static void initiateDriver() {
		driver = getBrowser(System.getenv("browsername"));
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	}
	
	@AfterMethod
	public static void closeBrowser() {
		
		driver.close();
		driver=null;
	}

}
