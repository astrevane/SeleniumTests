package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class JQueryListBoxTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(JQueryListBox.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void addFew() {
        Assert.assertTrue(JQueryListBox.isRightOneEmpty(driver));
        JQueryListBox.selectFromLeft(driver, "Alice", "Laura", "Julia");
        JQueryListBox.addSelected(driver);
        Assert.assertTrue(JQueryListBox.lookForAnyInRightOne(driver, "Alice"));
        Assert.assertTrue(JQueryListBox.lookForAnyInRightOne(driver, "Laura"));
        Assert.assertTrue(JQueryListBox.lookForAnyInRightOne(driver, "Julia"));
        Assert.assertFalse(JQueryListBox.isLeftOneEmpty(driver));
        JQueryListBox.addAll(driver);
        Assert.assertTrue(JQueryListBox.isLeftOneEmpty(driver));
        JQueryListBox.selectFromRight(driver, "Isis", "Lara", "Luiza");
        JQueryListBox.removeSelected(driver);
        Assert.assertTrue(JQueryListBox.lookForAnyInLeftOne(driver, "Isis"));
        Assert.assertTrue(JQueryListBox.lookForAnyInLeftOne(driver, "Lara"));
        Assert.assertTrue(JQueryListBox.lookForAnyInLeftOne(driver, "Luiza"));
        JQueryListBox.removeAll(driver);
        Assert.assertTrue(JQueryListBox.isRightOneEmpty(driver));
    }
    
}