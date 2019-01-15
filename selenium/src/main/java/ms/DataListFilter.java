package ms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

final public class DataListFilter {
    static final public String URL = "https://www.seleniumeasy.com/test/data-list-filter-demo.html";
    static public void filterPersonByName(WebDriver driver, String name) {
        driver.findElement(By.id("input-search")).sendKeys(name);
    }
    static public boolean searchForPerson(WebDriver driver, String name) {
        return driver.findElement(By.xpath("//*[text()='Name: " + name + "']")).isDisplayed();
    }
}