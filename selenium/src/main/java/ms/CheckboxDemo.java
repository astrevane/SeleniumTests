package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


final public class CheckboxDemo {
    static final public String URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
    static public void setSingleCheckboxAsChecked(WebDriver driver) {
       driver.findElement(By.id("isAgeSelected")).click();
    }
    static public String getSingleCheckoxConfirmationMessage(WebDriver driver) {
        return driver.findElement(By.id("txtAge")).getText();
    }
    static public void checkMultipleCheckboxes(WebDriver driver, int... indexes) {
        for (int i : indexes) {
            if (i >= 1 && i <= 4) {
                driver.findElement(By.xpath("//label[text()='Option " + i + "']//descendant::input")).click();
            }            
        }        
     }
     static private WebElement getCheckAllButton(WebDriver driver) {
         return driver.findElement(By.id("check1"));
     }
     static public void checkAll(WebDriver driver) {
        getCheckAllButton(driver).click();
     }
     static public String getMessageOnCheckAllButton(WebDriver driver) {
        return getCheckAllButton(driver).getAttribute("value");        
     }
}