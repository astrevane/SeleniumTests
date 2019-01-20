package ms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


final public class JQueryListBox {
    static final public String URL = "https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html";
    static private WebElement getDataList(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
    }   
    static private WebElement getResultList(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickListResult']"));
    }   
    static public void selectFromDataList(WebDriver driver, String... elements) {
        Select list = new Select(getDataList(driver));
        Actions action = new Actions(driver);
        List<WebElement> listElements = list.getOptions();        
        action.keyDown(Keys.LEFT_CONTROL);
        for (String element : elements) {
            for (int i = 0; i < listElements.size(); ++i) {
                if (element.equals(listElements.get(i).getText())) {
                    list.selectByIndex(i);
                }
            }
        }
        action.keyUp(Keys.LEFT_CONTROL);
        action.build().perform();        
    }
    static public void selectFromResultList(WebDriver driver, String... elements) {
        Select list = new Select(getResultList(driver));
        Actions action = new Actions(driver);
        List<WebElement> listElements = list.getOptions();        
        action.keyDown(Keys.LEFT_CONTROL);
        for (String element : elements) {
            for (int i = 0; i < listElements.size(); ++i) {
                if (element.equals(listElements.get(i).getText())) {
                    list.selectByIndex(i);
                }
            }
        }
        action.keyUp(Keys.LEFT_CONTROL);
        action.build().perform();        
    }
    static public void addSelected(WebDriver driver) {
        driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();
    }
    static public void addAll(WebDriver driver) {
        driver.findElement(By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']")).click();
    }
    static public void removeSelected(WebDriver driver) {
        driver.findElement(By.xpath("//button[@class='pRemove btn btn-primary btn-sm']")).click();
    }
    static public void removeAll(WebDriver driver) {
        driver.findElement(By.xpath("//button[@class='pRemoveAll btn btn-primary btn-sm']")).click();
    }
    static public boolean lookForAnyInResultList(WebDriver driver, String... elements) {
        List<WebElement> list = new Select(getResultList(driver)).getOptions();
        for (String element : elements) {
            for (int i = 0; i < list.size(); ++i) {
                if (element.equals(list.get(i).getText())) {
                    return true;
                }
            }
        }
        return false;
    }
    static public boolean lookForAnyInDataList(WebDriver driver, String... elements) {
        List<WebElement> list = new Select(getDataList(driver)).getOptions();
        for (String element : elements) {
            for (int i = 0; i < list.size(); ++i) {
                if (element.equals(list.get(i).getText())) {
                    return true;
                }
            }
        }
        return false;
    }
    static public boolean isResultListEmpty(WebDriver driver) {
        List<WebElement> list = new Select(getResultList(driver)).getOptions();
        if (list.isEmpty()) {
            return true;
        } 
        return false;
    }
    static public boolean isDataListEmpty(WebDriver driver) {
        List<WebElement> list = new Select(getDataList(driver)).getOptions();
        if (list.isEmpty()) {
            return true;
        } 
        return false;
    }
}