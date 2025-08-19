package com.example.MySQLWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

public class IframeExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load local main.html (remove "file:///" here!)
            File file = new File("src/main/java/com/example/MySQLWithSelenium/main.html");
            String url = "file:///" + file.getAbsolutePath().replace("\\", "/");
            driver.get(url);

            // Switch to iframe by id
            driver.switchTo().frame("myFrame");

            // Locate input inside the iframe
            WebElement messageInput = driver.findElement(By.id("message"));
            messageInput.sendKeys("Hello Learners!!!!");

            // Pause so you can see the result
            Thread.sleep(2000);

            // Switch back to main page
            driver.switchTo().defaultContent();
        } finally {
            driver.quit();
        }
    }
}
