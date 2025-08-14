   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		WebDriver driver=null; 
		try {
		// Launch Chrome browser
		driver = new ChromeDriver();
 
		// Go to Google
		driver.get("https://www.google.com");
	//	driver.get("http://www.flipkart.com");
 
		// Find the search box and type a query
		WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("Selenium WebDriver");
//		searchBox.sendKeys("women cloths");
 
		// Submit the search form
		searchBox.submit();
 
		// Wait a bit (basic pause, not best practice)
			Thread.sleep(2000); // Wait 2 seconds for results to load
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
 
		// Print the title of the results page
		System.out.println("Search Results Page Title: " + driver.getTitle());
 
		// Close the browser
		driver.quit();


	}

}
