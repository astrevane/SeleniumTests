package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class CheckboxDemoTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(CheckboxDemo.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testSingleCheckbox() {
        CheckboxDemo.setSingleCheckboxAsChecked(driver);  
        Assert.assertEquals("Success - Check box is checked", CheckboxDemo.getSingleCheckoxConfirmationMessage(driver));
    }
    @Test
    public void testCheckAll() {
        CheckboxDemo.checkAll(driver);
        Assert.assertEquals("Uncheck All", CheckboxDemo.getMessageOnCheckAllButton(driver));
        CheckboxDemo.checkMultipleCheckboxes(driver, 1, 2, 4);
        Assert.assertEquals("Check All", CheckboxDemo.getMessageOnCheckAllButton(driver));
    }
    
}