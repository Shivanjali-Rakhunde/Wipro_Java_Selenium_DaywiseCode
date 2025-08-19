package Day24.tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Day24.pages.EmployeeFormPage;

public class EmployeeFormTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://127.0.0.1:5500/index.html");
			driver.manage().window().maximize();

			EmployeeFormPage formPage = new EmployeeFormPage(driver);

			formPage.enterEmpId("101");
			formPage.enterEmpName("Harry");
			formPage.enterDOB("2001-01-11");
			formPage.enterAddress("123 ABC");
			formPage.enterContactNo("7777777777");
			formPage.enterEmail("harry@example.com");

//			System.out.println("\n--- Values before submission ---");
//			formPage.printAllFormValues();

			formPage.clickSubmit();
			
			 // Switch to alert
//            Alert alert = driver.switchTo().alert();

            // Read alert text
//            String alertMessage = alert.getText();
//            System.out.println("Alert message: " + alertMessage);

            // Accept the alert
//            alert.accept();
            
            
            // Wait for the confirm alert
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to confirm box
//            Alert confirm = driver.switchTo().alert();

            // Get and print confirm message
//            System.out.println("Confirm says: " + confirm.getText());

            // Accept (click OK) or cancel
//            confirm.accept();  // Or confirm.dismiss();
			
			Alert prompt = driver.switchTo().alert();
			System.out.println("Prompt says: " + prompt.getText());
			prompt.sendKeys("Some response");
			prompt.accept();
            
			Thread.sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
