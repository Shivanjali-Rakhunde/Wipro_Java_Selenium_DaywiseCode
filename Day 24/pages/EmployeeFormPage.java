package Day24.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeFormPage {

	WebDriver driver;

	public EmployeeFormPage(WebDriver driver) {
		this.driver = driver;
	}

	By empIdField = By.id("empId");
	By empNameField = By.id("empName");
	By dobField = By.id("dob");
	By addressField = By.id("address");
	By contactNoField = By.id("mobile");
	By emailField = By.id("email");
	By submitButton = By.cssSelector("button[type='submit']");

	// Actions
	public void enterEmpId(String empId) {
		driver.findElement(empIdField).sendKeys(empId);
	}

	public void enterEmpName(String empName) {
		driver.findElement(empNameField).sendKeys(empName);
	}

	public void enterDOB(String dob) {
		driver.findElement(dobField).sendKeys(dob);
	}

	public void enterAddress(String address) {
		driver.findElement(addressField).sendKeys(address);
	}

	public void enterContactNo(String contactNo) {
		driver.findElement(contactNoField).sendKeys(contactNo);
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}

	public String getFieldValue(By locator) {
		return driver.findElement(locator).getAttribute("value");
	}

//	public void printAllFormValues() {
//		System.out.println("Employee ID: " + getFieldValue(empIdField));
//		System.out.println("Employee Name: " + getFieldValue(empNameField));
//		System.out.println("DOB: " + getFieldValue(dobField));
//		System.out.println("Address: " + getFieldValue(addressField));
//		System.out.println("Mobile: " + getFieldValue(contactNoField));
//		System.out.println("Email: " + getFieldValue(emailField));
//	}
}
