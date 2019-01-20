package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


final public class AjaxFormSubmit {
    static final public String URL = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html";
    static private WebElement getSubmitButton(WebDriver driver) {
        return driver.findElement(By.id("btn-submit"));
    }
    static public void setInputName(WebDriver driver, String text) {
        driver.findElement(By.id("title")).sendKeys(text);
    }
    static public void setInputComment(WebDriver driver, String text) {
        driver.findElement(By.id("description")).sendKeys(text);
    }
    static public void clickSubmit(WebDriver driver) {
        getSubmitButton(driver).click();
    }
    static public boolean isSubmitButtonVisible(WebDriver driver) {        
        try {
            return getSubmitButton(driver).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public String getStatusMessage(WebDriver driver) {
        return driver.findElement(By.id("submit-control")).getText();
    }

}