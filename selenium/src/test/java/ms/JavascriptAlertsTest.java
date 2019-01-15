package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JavascriptAlertsTest
{
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(JavascriptAlerts.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testAlert() {
        JavascriptAlerts.clickAlertButton(driver);
        driver.switchTo().alert().accept();
    }
    @Test
    public void testConfirmatiion() {
        JavascriptAlerts.clickConfirmButton(driver);
        driver.switchTo().alert().accept();
        Assert.assertEquals("You pressed OK!", JavascriptAlerts.getConfirmMessage(driver));
        JavascriptAlerts.clickConfirmButton(driver);
        driver.switchTo().alert().dismiss();
        Assert.assertEquals("You pressed Cancel!", JavascriptAlerts.getConfirmMessage(driver));
    }
    @Test
    public void testPrompt() {
        JavascriptAlerts.clickPromptButton(driver);
        driver.switchTo().alert().dismiss();
        Assert.assertEquals("", JavascriptAlerts.getPromptMessage(driver));
        JavascriptAlerts.clickPromptButton(driver);
        driver.switchTo().alert().sendKeys("Bartek");
        driver.switchTo().alert().accept();
        Assert.assertEquals("You have entered 'Bartek' !", JavascriptAlerts.getPromptMessage(driver));
    }

}