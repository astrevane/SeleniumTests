package ms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.Select;


final public class JQuerySelectDropdown {
    static final public String URL = "https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html";
    static public void selectCountry(WebDriver driver, String country) {     
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.cssSelector("span.select2-search > input:nth-child(1)")).sendKeys(country);
        driver.findElement(By.xpath("//ul[@id='select2-country-results']//descendant::li")).click();        
    }
    static public String getSelectedCountry(WebDriver driver) {
        return driver.findElement(By.id("select2-country-container")).getText();
    }
    static public void selectStates(WebDriver driver, String... states) {    
        for (String state : states) {
            driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
            driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(state);
            //driver.findElement(By.cssSelector("span.select2-search > input:nth-child(1)")).sendKeys(country);
            driver.findElement(By.xpath("//li[text()='" + state + "']")).click();    
        }            
    }
    static public boolean isInSelectedStates(WebDriver driver, String state) {    
        try {
            driver.findElement(By.xpath("//li[@class='select2-selection__choice' and @title='" + state + "']"));
            return true;
        } catch(NoSuchElementException err) {
            return false;
        }        
    }
    static public void selectTerritory(WebDriver driver, String territory) {     
        driver.findElement(
            By.cssSelector("div.row:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(3) > span:nth-child(1) > span:nth-child(1)")
            ).click();
        driver.findElement(By.cssSelector("span.select2-search > input:nth-child(1)")).sendKeys(territory);
        driver.findElement(By.xpath("//li[text()='" + territory + "']")).click();        
    }
    static public String getSelectedTerritory(WebDriver driver) {
        return driver.findElement(
            By.cssSelector("div.row:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(3) > span:nth-child(1) > span:nth-child(1)")
            ).getText();
    }
    static public void selectLanguage(WebDriver driver, String category, String name) {   
        driver.findElement(By.xpath("//select[@id='files']")).click();
        driver.findElement(By.xpath("//select[@id='files']/optgroup[@label='" + category + "']/option[text()='" + name + "']")).click();       
    }

}