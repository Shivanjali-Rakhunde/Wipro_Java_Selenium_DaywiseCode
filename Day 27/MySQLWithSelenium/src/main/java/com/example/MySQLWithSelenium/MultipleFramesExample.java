package com.example.MySQLWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

public class MultipleFramesExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load main page with two iframes
            File file = new File("src/main/java/com/example/MySQLWithSelenium/main1.html");
            String url = "file:///" + file.getAbsolutePath().replace("\\", "/");
            driver.get(url);

            // -------- Switch to frame1 --------
            driver.switchTo().frame("frame1");
            WebElement input1 = driver.findElement(By.id("input1"));
            input1.sendKeys("Hello from Frame 1!");
            Thread.sleep(2000);

            // Back to main page
            driver.switchTo().defaultContent();

            // -------- Switch to frame2 --------
            driver.switchTo().frame("frame2");
            WebElement input2 = driver.findElement(By.id("input2"));
            input2.sendKeys("Hello from Frame 2!");
            Thread.sleep(3000);

            // Back to main page again
            driver.switchTo().defaultContent();
            
            // -------- Switch to frame3 --------
            driver.switchTo().frame("frame3");
            WebElement input3 = driver.findElement(By.id("input3"));
            input3.sendKeys("Hello from Frame 3!");
            Thread.sleep(4000);

            // Back to main page again
            driver.switchTo().defaultContent();

        } finally {
            driver.quit();
        }
    }
}
