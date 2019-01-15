package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class SimpleFormDemoTest
{
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(SimpleFormDemo.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testSingleInputField() {
        SimpleFormDemo.getMessageInput(driver).sendKeys("american beauty");
        SimpleFormDemo.getShowMessageButton(driver).click();        
        Assert.assertEquals("american beauty", SimpleFormDemo.getDisplayedMessage(driver));       
    }
    @Test
    public void testTwoInputFields() {
        SimpleFormDemo.getFirstValueInput(driver).sendKeys("2");
        SimpleFormDemo.getSecondValueInput(driver).sendKeys("3");
        SimpleFormDemo.getSumValuesInput(driver).click();
        Assert.assertEquals("5", SimpleFormDemo.getSumText(driver));
    }
    

}
