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
    static public void clickWarningAuto(WebDriver driver) {
        driver.findElement(By.id("autoclosable-btn-warning")).click();
    }
    static public boolean isWarningAutoVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-warning alert-autocloseable-warning']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void clickWarningNormal(WebDriver driver) {
        driver.findElement(By.id("normal-btn-warning")).click();
    }
    static public boolean isWarningNormalVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void closeWarningNormal(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']/button")).click();
    }

    static public void clickDangerAuto(WebDriver driver) {
        driver.findElement(By.id("autoclosable-btn-danger")).click();
    }
    static public boolean isDangerAutoVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-danger alert-autocloseable-danger']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void clickDangerNormal(WebDriver driver) {
        driver.findElement(By.id("normal-btn-danger")).click();
    }
    static public boolean isDangerNormalVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void closeDangerNormal(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']/button")).click();
    }

    static public void clickInfoAuto(WebDriver driver) {
        driver.findElement(By.id("autoclosable-btn-info")).click();
    }
    static public boolean isInfoAutoVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-info alert-autocloseable-info']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void clickInfoNormal(WebDriver driver) {
        driver.findElement(By.id("normal-btn-info")).click();
    }
    static public boolean isInfoNormalVisible(WebDriver driver) {
        try {
            return driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']")).isDisplayed();
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void closeInfoNormal(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']/button")).click();
    }
}