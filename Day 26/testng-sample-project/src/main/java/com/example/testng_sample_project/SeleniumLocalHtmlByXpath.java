package com.example.testng_sample_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumLocalHtmlByXpath {
    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Build a file:// URL for the local HTML
        File htmlFile = new File("C:/Users/Shivanjali/eclipse-workspace/testng-sample-project/src/main/java/com/example/testng_sample_project/myhtml.html");
        String url = "file:///" + htmlFile.getAbsolutePath().replace("\\", "/");

        // Open the local HTML file
        driver.get(url);

        // Print page source for debugging
        System.out.println(driver.getPageSource());

        // Locate the text field with XPath and type something
        WebElement inputField = driver.findElement(By.xpath("//input[@id='searchBox']"));
        inputField.sendKeys("Hello Learners!");

        // Locate the button with XPath and click it
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='search-button']"));
        searchButton.click();

        // Wait a few seconds so you see the result
        Thread.sleep(3000);
        driver.quit();
    }
}
