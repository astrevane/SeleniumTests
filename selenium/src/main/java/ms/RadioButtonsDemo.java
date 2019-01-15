package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



final public class RadioButtonsDemo {
    static final public String URL = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    static public void clickRadioButton(WebDriver driver, String text) {
        driver.findElement(By.xpath("//input[@value='" + text + "' and @name='optradio']")).click();
    }
    static public void clickGetValueButton(WebDriver driver) {
        driver.findElement(By.id("buttoncheck")).click();
    }
    static public String getValueMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
    }
    static public void clickRadioButtons(WebDriver driver, String sex, String age) {
        driver.findElement(By.xpath("//input[@value='" + sex + "' and @name='gender']")).click();
        driver.findElement(By.xpath("//label[text()='" + age + "']//descendant::input")).click();
    }
    static public void clickGetValuesButton(WebDriver driver) {
        driver.findElement(By.xpath("//button[text()='Get values']")).click();
    }
    static public String getValuesMessage(WebDriver driver) {
        // return driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getAttribute("firstChild") + 
        // driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getAttribute("lastChild");
        return driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getAttribute("innerHTML");
    }
}