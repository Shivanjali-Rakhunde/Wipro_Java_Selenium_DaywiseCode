package com.example.MySQLWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

public class LocalDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load local HTML file
            File file = new File("src/main/java/com/example/MySQLWithSelenium/dragdrop.html");
            String url = "file:///" + file.getAbsolutePath().replace("\\", "/");
            driver.get(url);

            // Locate elements
            WebElement dragElement = driver.findElement(By.id("drag"));
            WebElement dropElement = driver.findElement(By.id("drop"));

            // Perform drag and drop
            Actions actions = new Actions(driver);
            actions.dragAndDrop(dragElement, dropElement).perform();

            Thread.sleep(2000); // Just to see the result
        } finally {
            driver.quit();
        }
    }
}
