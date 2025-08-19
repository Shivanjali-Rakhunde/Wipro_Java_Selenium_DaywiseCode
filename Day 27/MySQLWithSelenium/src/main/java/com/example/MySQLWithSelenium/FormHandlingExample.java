package com.example.MySQLWithSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormHandlingExample {
    public static void main(String[] args) {

        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load the local HTML file
            driver.get("file:///C:/Users/Shivanjali/eclipse-workspace/MySQLWithSelenium/src/main/java/com/example/MySQLWithSelenium/form.html");

            // Select radio button (Male)
            WebElement femaleRadio = driver.findElement(By.id("female"));
            if (!femaleRadio.isSelected()) {
                femaleRadio.click();
            }

            // Select checkbox
            WebElement agreeCheckbox = driver.findElement(By.id("agree"));
            if (!agreeCheckbox.isSelected()) {
                agreeCheckbox.click();
            }

            // Select dropdown value 
            WebElement countryDropdownElement = driver.findElement(By.id("country"));
            Select countryDropdown = new Select(countryDropdownElement);
            countryDropdown.selectByVisibleText("Brazil");

            //Print selected country
            WebElement selected = countryDropdown.getFirstSelectedOption();
            System.out.println("Selected Country: " + selected.getText());

            
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

