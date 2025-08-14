import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentAppTest {

	public static void main(String[] args) {
		WebDriver driver=null; 
		try {
		// Launch Chrome browser
		driver = new ChromeDriver();
 
		// Go to Google
		//driver.get("https://www.google.com");
		
		
		// Go to YouTube
		driver.get("http://www.YouTube.com");
		
		
		//Go to Gmail
		//driver.get("http://www.gmail.com");
		
		//Go to amazon
		//driver.get("http://www.amazon.com");
		
		
 
		// Find the search box and type a query
//		WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys("Selenium WebDriver");
		
		//For YouTube
		WebElement searchBox = driver.findElement(By.name("search_query"));
		//driver.findElement(By.id("search-icon-legacy")).click();
		searchBox.sendKeys("Songs");
		
		
		//For Gmail
//		WebElement searchBox = driver.findElement(By.id("identifierId"));
//		WebElement searchBox1 = driver.findElement(By.name("Passwd"));
//		searchBox.sendKeys("shivanjalirakhunde2525@gmail.com");
//		searchBox1.sendKeys("Shivanjali@2525");
		
		
		//For amazon
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchBox.sendKeys("Bags");
		
		
		
		
 
		// Submit the search form
		searchBox.submit();
 
		// Wait a bit (basic pause, not best practice)
			Thread.sleep(10000); // Wait 2 seconds for results to load
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
 
		// Print the title of the results page
		System.out.println("Search Results Page Title: " + driver.getTitle());
 
		// Close the browser
		driver.quit();

	}

}
