package ms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


final public class SelectDropdownList {
    static final public String URL = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
    static public void selectFromList(WebDriver driver, String element) {
        WebElement select = driver.findElement(By.id("select-demo"));
        Select day = new Select(select);
        select.click();
        day.selectByVisibleText(element);
    }
    static public String getDaySelectedMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
    }
    static public void selectMultipleFromList(WebDriver driver, String... elements) { 
        Select list = new Select(driver.findElement(By.id("multi-select")));
        Actions action = new Actions(driver);
        List<WebElement> listElements = list.getOptions();        
        action.keyDown(Keys.LEFT_CONTROL);
        for (String element : elements) {
            for (int i = 0; i < listElements.size(); ++i) {
                if (element.equals(listElements.get(i).getText())) {
                    action.click(list.getOptions().get(i));
                }
            }
        }
        action.keyUp(Keys.LEFT_CONTROL);
        action.build().perform();        
    }
    static public void clickForFirstSelected(WebDriver driver) {
        driver.findElement(By.id("printMe")).click();
    }
    static public void clickForAllSelected(WebDriver driver) {
        driver.findElement(By.id("printAll")).click();
    }
    static public String getStatesSelectedMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
    }

}