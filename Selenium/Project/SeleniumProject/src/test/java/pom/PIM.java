package pom;

import java.io.IOException;
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
import utilities.UtilityLibrary;

public class PIM extends BaseTest{
	
	private static String [][] testData;
	static String fstName,eid;
	private static final String dashboard = "//b[text()='PIM']";
	private static final String employeeInfoHeader = "//a[contains(@class,'toggle')]";
	private static final String firstName ="//input[contains(@id,'firstName')]";
	private static final String middleName ="//input[contains(@id,'middleName')]";
	private static final String lastName ="//input[contains(@id,'lastName')]";
	private static final String editedFirstName ="//input[contains(@id,'FirstName')]";
	private static final String editedlastName ="//input[contains(@id,'LastName')]";
	private static final String empID ="//input[@id='employeeId']";
	private static final String photograph = "//input[@id='photofile']";
	private static final String addBtn ="//input[@id='btnAdd']";
	private static final String saveBtn ="//input[@id='btnSave']";
	private static final String empSearch ="//input[@id='empsearch_employee_name_empName']";
	private static final String searchBtn ="//input[@id='searchBtn']";
	private static final String empIDS = "//table[@id='resultTable']/tbody/tr/td[2]";
	private static final String empList = "//a[text()='Employee List']";
	private static final String genderMale ="//input[@id='personal_optGender_1']";
	private static final String nationality = "//select[@id='personal_cmbNation']";
	private static final String dob = "//input[@id='personal_DOB']";
	private static final String monthDrop = "//select[contains(@class,'month')]";
	private static final String yearDrop = "//select[contains(@class,'year')]";
	private static final String date = "//table[@class='ui-datepicker-calendar']//td//a[text()='Temp']";
	
	public static void clickOnPIM(WebDriver driver) {
		driver.findElement(By.xpath(dashboard)).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeInfoHeader)));
	}
	
	
	public static void enterData(WebDriver driver) throws IOException {
		testData = UtilityLibrary.readExcel();
		for(int i=0; i<testData.length;i++) {
			for(int j=0;j<testData[0].length;j++) {
				switch(testData[i][j]) {
				case "FirstName" :
					driver.findElement(By.xpath(firstName)).sendKeys(testData[i+1][j]);
					fstName = testData[i+1][j];
					break;
					
				case "MiddleName" :
					driver.findElement(By.xpath(middleName)).sendKeys(testData[i+1][j]);
					break;
					
				case "LastName" :
					driver.findElement(By.xpath(lastName)).sendKeys(testData[i+1][j]);
					break;
				case "EmployeeID" :
					driver.findElement(By.xpath(empID)).sendKeys(testData[i+1][j]);
					eid=testData[i+1][j];
					break;
			
				}
			}
		}
		driver.findElement(By.xpath(photograph)).sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Capture.png");
	}
	
	public static void addEmployee(WebDriver driver) {
		driver.findElement(By.xpath(addBtn)).click();
		
	}
	
	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.xpath(saveBtn)).click();
		
	}
	
	public static void verifyEmpCreation(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(empList)).click();
		driver.findElement(By.xpath(empSearch)).sendKeys(fstName);
		driver.findElement(By.xpath(searchBtn)).click();
		List<WebElement> list= driver.findElements(By.xpath(empIDS));
		for(WebElement ele : list) {
			if(ele.getText().contains(eid)) {
				Assert.assertTrue(true);
				System.out.println("Employee Created");
				break;
			}else {
				Assert.assertTrue(false);
				System.out.println("Employee not Created");
				
			}
		}
	}
	
	public static void searchEmployee(WebDriver driver, String firstName) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(empList)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(empSearch)).sendKeys(firstName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(searchBtn)).click();
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath(empIDS));
		for(WebElement ele : list) {
			if(ele.getText().contains("145")) {
				Assert.assertTrue(true);
				ele.click();
				System.out.println("Emp searched");
				break;
			}else {
				Assert.assertTrue(false);
				
				
			}
		}
	}
	
	public static void editEmployee(WebDriver driver, String dd_mmm_yy_format) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(saveBtn)).click();
		driver.findElement(By.xpath(editedFirstName)).clear();
		driver.findElement(By.xpath(editedFirstName)).sendKeys("EditedFirst");
		driver.findElement(By.xpath(editedlastName)).clear();
		driver.findElement(By.xpath(editedlastName)).sendKeys("EditedLast");
		driver.findElement(By.xpath(genderMale)).click();
		Select s = new Select(driver.findElement(By.xpath(nationality)));
		s.selectByVisibleText("Indian");
		String[] dateSplit = dd_mmm_yy_format.split("_");
		driver.findElement(By.xpath(dob)).click();
		Select month = new Select(driver.findElement(By.xpath(monthDrop)));
		month.selectByVisibleText(dateSplit[1]);
		Select year = new Select(driver.findElement(By.xpath(yearDrop)));
		year.selectByVisibleText(dateSplit[2]);
		driver.findElement(By.xpath(date.replace("Temp", dateSplit[0]))).click();
		driver.findElement(By.xpath(saveBtn)).click();
	}
}
