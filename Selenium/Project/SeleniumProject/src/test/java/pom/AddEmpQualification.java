package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.BaseTest;

public class AddEmpQualification extends BaseTest{
	
	
	private static final String myInfo = "//a[@id='menu_pim_viewMyDetails']";
	private static final String qualification = "//ul[@id='sidenav']//a[text()='Qualifications']";
	private static final String addBtn = "//input[@id='addWorkExperience']";
	private static final String company = "//input[@id='experience_employer']";
	private static final String jobTitle = "//input[@id='experience_jobtitle']";
	private static final String fromDate = "//input[@id='experience_from_date']";
	private static final String toDate = "//input[@id='experience_to_date']";
	private static final String monthDrop = "//select[@class='ui-datepicker-month']";
	private static final String yearDrop = "//select[@class='ui-datepicker-year']";
	private static final String date = "//table[@class='ui-datepicker-calendar']//td//a[text()='Temp']";
	private static final String commentBox = "//textarea[@id='experience_comments']";
	private static final String saveBtn =  "//input[@id='btnWorkExpSave']";
	
	
	public static void clickOnMyInfo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(myInfo)).click();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(qualification)));
		driver.findElement(By.xpath(qualification)).click();
		

		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.
				findElement(By.xpath(addBtn))));
		driver.findElement(By.xpath(addBtn)).click();
	}
	
	
	public static void addExperience(WebDriver driver, 
			String fromdate_dd_mmm_yyyy_format,String todate_dd_mmm_yyyy_format) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(company)).sendKeys("TestCompany");
		driver.findElement(By.xpath(jobTitle)).sendKeys("Manager");
		driver.findElement(By.xpath(fromDate)).click();
		datePicker(driver,fromdate_dd_mmm_yyyy_format);
		driver.findElement(By.xpath(toDate)).click();
		datePicker(driver,todate_dd_mmm_yyyy_format);
		driver.findElement(By.xpath(commentBox)).sendKeys("This is a Test Experience");
		driver.findElement(By.xpath(saveBtn)).click();
		Thread.sleep(2000);
		System.out.println("Emp experience added");
		
	}
	
	public static void datePicker(WebDriver driver,String date_dd_mmm_yyyy_format) {
		String[] fromDate = date_dd_mmm_yyyy_format.split("_");
		Select month = new Select(driver.findElement(By.xpath(monthDrop)));
		month.selectByVisibleText(fromDate[1]);
		Select year = new Select(driver.findElement(By.xpath(yearDrop)));
		year.selectByVisibleText(fromDate[2]);
		driver.findElement(By.xpath(date.replace("Temp", fromDate[0]))).click();
	}

}
	
	

																																																																																																									