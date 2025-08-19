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

public class App {
    static WebDriver driver;

    public static void main(String[] args) {
        try {
            // File will be read from the "resources" folder in your project
            String filePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "TestSteps.xlsx";
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(file);

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // skip header

                String keyword = getCellValue(row.getCell(1));
                String locatorType = getCellValue(row.getCell(2));
                String locatorValue = getCellValue(row.getCell(3));
                String data = getCellValue(row.getCell(4));

                executeStep(keyword, locatorType, locatorValue, data);
            }

            workbook.close();
            file.close();

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
        switch (keyword.toLowerCase()) {
//            case "openbrowser":
//                driver = new ChromeDriver();
//                break;
        
        case "openbrowser":
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
            break;

            case "openurl":
                driver.get(data);
                break;

            case "inputtext":
                getElement(locatorType, locatorValue).sendKeys(data);
                break;

            case "click":
                getElement(locatorType, locatorValue).click();
                break;

            case "acceptalert":
                waitForAlert();
                driver.switchTo().alert().accept();
                break;

            case "dismissalert":
                waitForAlert();
                driver.switchTo().alert().dismiss();
                break;

            case "getalerttext":
                waitForAlert();
                System.out.println("Alert says: " + driver.switchTo().alert().getText());
                break;

            case "sendtoprompt":
                waitForAlert();
                Alert prompt = driver.switchTo().alert();
                prompt.sendKeys(data);
                prompt.accept();
                break;

            case "closebrowser":
                driver.quit();
                break;

            default:
                System.out.println("Unknown keyword: " + keyword);
                break;
        }
    }

    public static WebElement getElement(String type, String value) {
        switch (type.toLowerCase()) {
            case "id":
                return driver.findElement(By.id(value));
            case "name":
                return driver.findElement(By.name(value));
            case "cssselector":
                return driver.findElement(By.cssSelector(value));
            case "xpath":
                return driver.findElement(By.xpath(value));
            default:
                throw new IllegalArgumentException("Invalid locator type: " + type);
        }
    }

    public static void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
