package com.example.testng_sample_project;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWebTableExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Load local HTML file (use normal path, not file:///)
        File htmlFile = new File("C:/Users/Shivanjali/eclipse-workspace/testng-sample-project/src/main/java/com/example/testng_sample_project/table.html");
        String url = "file:///" + htmlFile.getAbsolutePath().replace("\\", "/");
        driver.get(url);

        // Locate all rows inside tbody
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));

        // Iterate each row
        for (WebElement row : rows) {
            // Get all cells (td) in current row
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print each cell value
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "    ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
