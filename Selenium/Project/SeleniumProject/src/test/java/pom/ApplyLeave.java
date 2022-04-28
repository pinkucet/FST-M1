package pom;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basetest.BaseTest;

public class ApplyLeave extends BaseTest{
	
	private static final String applyLeave ="//span[text()='Apply Leave']/preceding-sibling::img";
	private static final String applyLeaveHeader ="//h1[text()='Apply Leave']";
	private static final String leaveType ="//select[@id='applyleave_txtLeaveType']";
	private static final String fromDate = "//input[@id='applyleave_txtFromDate']";
	private static final String toDate = "//input[@id='applyleave_txtToDate']";
	private static final String monthDrop = "//select[@class='ui-datepicker-month']";
	private static final String yearDrop = "//select[@class='ui-datepicker-year']";
	private static final String date = "//table[@class='ui-datepicker-calendar']//td//a[text()='Temp']";
	private static final String commentBox = "//textarea[@id='applyleave_txtComment']";
	private static final String applyBtn =  "//input[@id='applyBtn']";
	private static final String myLeave = "//a[text()='My Leave']";
	private static final String searchBtn =  "//input[@id='btnSearch']";
	private static final String commentsInResultTable ="//table[@id='resultTable']//span[@class='commentContainerLong']";
	
	
	public static void clickOnApplyLeave(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(applyLeave)).click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.
				findElement(By.xpath(applyLeaveHeader))));
		
	}
	
	
	public static void EnterLeaveDetails(WebDriver driver, 
			String fromdate_dd_mmm_yyyy_format,String todate_dd_mmm_yyyy_format) throws InterruptedException {
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.xpath(leaveType)));
		s.selectByValue("1");
		driver.findElement(By.xpath(fromDate)).click();
		datePicker(driver,fromdate_dd_mmm_yyyy_format);
		driver.findElement(By.xpath(toDate)).click();
		datePicker(driver,todate_dd_mmm_yyyy_format);
		driver.findElement(By.xpath(commentBox)).sendKeys("This is a Test Leave");
		driver.findElement(By.xpath(applyBtn)).click();
		Thread.sleep(2000);
		System.out.println("Emp Leave Applied");
		
	}
	
	public static void datePicker(WebDriver driver,String date_dd_mmm_yyyy_format) {
		String[] fromDate = date_dd_mmm_yyyy_format.split("_");
		Select month = new Select(driver.findElement(By.xpath(monthDrop)));
		month.selectByVisibleText(fromDate[1]);
		Select year = new Select(driver.findElement(By.xpath(yearDrop)));
		year.selectByVisibleText(fromDate[2]);
		driver.findElement(By.xpath(date.replace("Temp", fromDate[0]))).click();
	}
	
	public static void verifyLeave(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(myLeave)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(searchBtn)).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(commentsInResultTable));
		int count=0;
		for(WebElement ele: list) {
			if(ele.getText().equals("This is a Test Leave")) {
				System.out.println("Leave is available in Result table");
				count++;
				break;
			}
		}
		
		if(count==0) {
			Assert.assertTrue(false,"Leave detail not found in result table");
		}
		
	}


}
