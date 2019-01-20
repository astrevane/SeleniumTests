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
        Assert.assertTrue(JQueryListBox.isResultListEmpty(driver));
        JQueryListBox.selectFromDataList(driver, "Alice", "Laura", "Julia");
        JQueryListBox.addSelected(driver);
        Assert.assertTrue(JQueryListBox.lookForAnyInResultList(driver, "Alice"));
        Assert.assertTrue(JQueryListBox.lookForAnyInResultList(driver, "Laura"));
        Assert.assertTrue(JQueryListBox.lookForAnyInResultList(driver, "Julia"));
        Assert.assertFalse(JQueryListBox.isDataListEmpty(driver));
        JQueryListBox.addAll(driver);
        Assert.assertTrue(JQueryListBox.isDataListEmpty(driver));
        JQueryListBox.selectFromResultList(driver, "Isis", "Lara", "Luiza");
        JQueryListBox.removeSelected(driver);
        Assert.assertTrue(JQueryListBox.lookForAnyInDataList(driver, "Isis"));
        Assert.assertTrue(JQueryListBox.lookForAnyInDataList(driver, "Lara"));
        Assert.assertTrue(JQueryListBox.lookForAnyInDataList(driver, "Luiza"));
        JQueryListBox.removeAll(driver);
        Assert.assertTrue(JQueryListBox.isResultListEmpty(driver));
    }
    
}