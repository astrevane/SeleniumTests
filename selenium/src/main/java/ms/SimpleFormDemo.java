package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

final public class SimpleFormDemo {
    static final public String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
    static public WebElement getMessageInput(WebDriver driver) {
        return driver.findElement(By.id("user-message"));
    }
    static public WebElement getShowMessageButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()='Show Message']"));
    }
    static public String getDisplayedMessage(WebDriver driver) {
        return driver.findElement(By.id("display")).getAttribute("textContent");
    }
    static public WebElement getFirstValueInput(WebDriver driver) {
        return driver.findElement(By.id("sum1"));
    }
    static public WebElement getSecondValueInput(WebDriver driver) {
        return driver.findElement(By.id("sum2"));
    }
    static public WebElement getSumValuesInput(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()='Get Total']"));
    }
    static public String getSumText(WebDriver driver) {
        return driver.findElement(By.id("displayvalue")).getAttribute("textContent");
    }
}