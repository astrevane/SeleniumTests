package ms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.Select;


final public class BootstrapAlert {
    static final public String URL = "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html";
    static public void clickSuccesAuto(WebDriver driver) {
        driver.findElement(By.id("autoclosable-btn-success")).click();
    }
    static public boolean isSuccesAutoVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-success alert-autocloseable-success']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void clickSuccesNormal(WebDriver driver) {
        driver.findElement(By.id("normal-btn-success")).click();
    }
    static public boolean isSuccesNormalVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void closeSuccesNormal(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']/button")).click();
    }
}