import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path to your browser driver executable
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivanjali\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Initialize the browser
        driver.get("https://www.google.com"); // Navigate to a website
        System.out.println("Title: " + driver.getTitle()); // Print the page title
        driver.quit(); // Close the browser
	}

}
