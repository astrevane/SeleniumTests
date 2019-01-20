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
        SimpleFormDemo.setMessageInput(driver, "american beauty");;
        SimpleFormDemo.clickShowMessageButton(driver);        
        Assert.assertEquals("american beauty", SimpleFormDemo.getDisplayedMessage(driver));       
    }
    @Test
    public void testTwoInputFields() {
        SimpleFormDemo.setFirstValueInput(driver, "2");
        SimpleFormDemo.setSecondValueInput(driver, "3");
        SimpleFormDemo.clickSumValuesButton(driver);
        Assert.assertEquals("5", SimpleFormDemo.getSumText(driver));
    }
    

}
