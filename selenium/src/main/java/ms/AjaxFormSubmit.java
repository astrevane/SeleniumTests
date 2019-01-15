package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


final public class AjaxFormSubmit {
    static final public String URL = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html";
    static public void setInputName(WebDriver driver, String text) {
        driver.findElement(By.id("title")).sendKeys(text);
    }
    static public void setInputComment(WebDriver driver, String text) {
        driver.findElement(By.id("description")).sendKeys(text);
    }
    static public void clickSubmit(WebDriver driver) {
        driver.findElement(By.id("btn-submit")).click();
    }
    static public boolean isSubmitButtonVisible(WebDriver driver) {        
        try {
            return driver.findElement(By.id("btn-submit")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public String getStatusMessage(WebDriver driver) {
        return driver.findElement(By.id("submit-control")).getText();
    }

}