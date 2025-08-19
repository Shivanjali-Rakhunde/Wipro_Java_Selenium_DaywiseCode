package com.example.testng_sample_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class XPathExample {
   public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
       driver.get("file:///C:/Users/Shivanjali/eclipse-workspace/testng-sample-project/src/main/java/com/example/testng_sample_project/example.html");
 
       // Locate input field for username using only XPath (no id/name/class)
       WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
      usernameField.sendKeys("admin");
 
       // Locate input field for password using only XPath
       WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
      passwordField.sendKeys("admin123");
 
       // Locate submit button using only XPath
       WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
      loginButton.click();
 
       driver.quit();
   }
}
