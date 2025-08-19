package com.example.excelselenium1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

public class KeywordDrivenTest {
    static WebDriver driver;
    static boolean browserOpen = false;
    static WebDriverWait wait;

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("TestSteps.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;

                String keyword = row.getCell(1).getStringCellValue();
                String locatorType = getCellValue(row.getCell(2));
                String locatorValue = getCellValue(row.getCell(3));
                String data = getCellValue(row.getCell(4));

                executeStep(keyword, locatorType, locatorValue, data);
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getCellValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((int) cell.getNumericCellValue());
            default:
                return "";
        }
    }

    public static void executeStep(String keyword, String locatorType, String locatorValue, String data) {
        keyword = keyword.trim().toLowerCase();

        if (!browserOpen && !keyword.equals("openbrowser")) {
            System.out.println("Skipping step '" + keyword + "' because browser is not open.");
            return;
        }

        try {
            switch (keyword) {
                case "openbrowser":
                    driver = new ChromeDriver();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(3000)); // 10s wait
                    browserOpen = true;
                    break;

                case "openurl":
                    driver.get(data);
                    break;

                case "inputtext":
                    waitForElement(locatorType, locatorValue).sendKeys(data);
                    break;

                case "click":
                    waitForElement(locatorType, locatorValue).click();
                    break;

                case "closebrowser":
                    driver.quit();
                    browserOpen = false;
                    break;

                default:
                    System.out.println("Unknown keyword: " + keyword);
            }
        } catch (Exception e) {
            System.out.println("Error executing step '" + keyword + "': " + e.getMessage());
        }
    }

    public static WebElement waitForElement(String type, String value) {
        By locator;
        switch (type.toLowerCase()) {
            case "id":
                locator = By.id(value);
                break;
            case "name":
                locator = By.name(value);
                break;
            case "cssselector":
                locator = By.cssSelector(value);
                break;
            case "xpath":
                locator = By.xpath(value);
                break;
            default:
                throw new IllegalArgumentException("Invalid locator type: " + type);
        }
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
