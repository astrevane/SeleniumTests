package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class RadioButtonsDemoTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(RadioButtonsDemo.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testFirstForm() {
        RadioButtonsDemo.clickRadioButton(driver, "Female");
        RadioButtonsDemo.clickGetValueButton(driver);
        Assert.assertEquals("Radio button 'Female' is checked", RadioButtonsDemo.getValueMessage(driver));
        RadioButtonsDemo.clickRadioButton(driver, "Male");
        RadioButtonsDemo.clickGetValueButton(driver);
        Assert.assertEquals("Radio button 'Male' is checked", RadioButtonsDemo.getValueMessage(driver));
    }
    @Test
    public void testGroupForm() {
        RadioButtonsDemo.clickRadioButtons(driver, "Female", "5 to 15");
        RadioButtonsDemo.clickGetValuesButton(driver);
        Assert.assertEquals("Sex : Female<br> Age group: 5 - 15", RadioButtonsDemo.getValuesMessage(driver));
        RadioButtonsDemo.clickRadioButtons(driver, "Male", "15 to 50");
        RadioButtonsDemo.clickGetValuesButton(driver);
        Assert.assertEquals("Sex : Male<br> Age group: 15 - 50", RadioButtonsDemo.getValuesMessage(driver));
    }

}