package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

final public class SimpleFormDemo {
    static final public String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
    static public void setMessageInput(WebDriver driver, String message) {
        driver.findElement(By.id("user-message")).sendKeys(message);
    }
    static public void clickShowMessageButton(WebDriver driver) {
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
    }
    static public String getDisplayedMessage(WebDriver driver) {
        return driver.findElement(By.id("display")).getAttribute("textContent");
    }
    static public void setFirstValueInput(WebDriver driver, String value) {
        driver.findElement(By.id("sum1")).sendKeys(value);
    }
    static public void setSecondValueInput(WebDriver driver, String value) {
        driver.findElement(By.id("sum2")).sendKeys(value);
    }
    static public void clickSumValuesButton(WebDriver driver) {
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
    }
    static public String getSumText(WebDriver driver) {
        return driver.findElement(By.id("displayvalue")).getAttribute("textContent");
    }
}