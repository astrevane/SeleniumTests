package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;




public class BootstrapAlertTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(BootstrapAlert.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testSuccess() {
        Assert.assertFalse(BootstrapAlert.isSuccesAutoVisible(driver));
        BootstrapAlert.clickSuccesAuto(driver);
        Assert.assertTrue(BootstrapAlert.isSuccesAutoVisible(driver));
        Driver.waitFor(6000);
        Assert.assertFalse(BootstrapAlert.isSuccesAutoVisible(driver));
        Assert.assertFalse(BootstrapAlert.isSuccesNormalVisible(driver));
        BootstrapAlert.clickSuccesNormal(driver);
        Assert.assertTrue(BootstrapAlert.isSuccesNormalVisible(driver));
        BootstrapAlert.closeSuccesNormal(driver);
        Assert.assertFalse(BootstrapAlert.isSuccesNormalVisible(driver));
    }
    
}