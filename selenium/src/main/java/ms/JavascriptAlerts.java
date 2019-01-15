package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

final public class JavascriptAlerts {
    static final public String URL = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
    static public void clickAlertButton(WebDriver driver) {
        driver.findElement(By.cssSelector("div.panel:nth-child(4) > div:nth-child(2) > button:nth-child(4)")).click();
    }
    static public void clickConfirmButton(WebDriver driver) {
        driver.findElement(By.cssSelector("div.panel:nth-child(5) > div:nth-child(2) > button:nth-child(4)")).click();
    }
    static public String getConfirmMessage(WebDriver driver) {
        return driver.findElement(By.id("confirm-demo")).getText();
    }
    static public void clickPromptButton(WebDriver driver) {
        driver.findElement(By.cssSelector("div.panel:nth-child(6) > div:nth-child(2) > button:nth-child(4)")).click();        
    }
    static public String getPromptMessage(WebDriver driver) {
        return driver.findElement(By.id("prompt-demo")).getText();
    }
}