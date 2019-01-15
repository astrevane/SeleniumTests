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
    @Test
    public void testWarning() {
        Assert.assertFalse(BootstrapAlert.isWarningAutoVisible(driver));
        BootstrapAlert.clickWarningAuto(driver);
        Assert.assertTrue(BootstrapAlert.isWarningAutoVisible(driver));
        Driver.waitFor(4000);
        Assert.assertFalse(BootstrapAlert.isWarningAutoVisible(driver));
        Assert.assertFalse(BootstrapAlert.isWarningNormalVisible(driver));
        BootstrapAlert.clickWarningNormal(driver);
        Assert.assertTrue(BootstrapAlert.isWarningNormalVisible(driver));
        BootstrapAlert.closeWarningNormal(driver);
        Assert.assertFalse(BootstrapAlert.isWarningNormalVisible(driver));
    }
    @Test
    public void testDanger() {
        Assert.assertFalse(BootstrapAlert.isDangerAutoVisible(driver));
        BootstrapAlert.clickDangerAuto(driver);
        Assert.assertTrue(BootstrapAlert.isDangerAutoVisible(driver));
        Driver.waitFor(6000);
        Assert.assertFalse(BootstrapAlert.isDangerAutoVisible(driver));
        Assert.assertFalse(BootstrapAlert.isDangerNormalVisible(driver));
        BootstrapAlert.clickDangerNormal(driver);
        Assert.assertTrue(BootstrapAlert.isDangerNormalVisible(driver));
        BootstrapAlert.closeDangerNormal(driver);
        Assert.assertFalse(BootstrapAlert.isDangerNormalVisible(driver));
    }
    @Test
    public void testInfo() {
        Assert.assertFalse(BootstrapAlert.isInfoAutoVisible(driver));
        BootstrapAlert.clickInfoAuto(driver);
        Assert.assertTrue(BootstrapAlert.isInfoAutoVisible(driver));
        Driver.waitFor(7000);
        Assert.assertFalse(BootstrapAlert.isInfoAutoVisible(driver));
        Assert.assertFalse(BootstrapAlert.isInfoNormalVisible(driver));
        BootstrapAlert.clickInfoNormal(driver);
        Assert.assertTrue(BootstrapAlert.isInfoNormalVisible(driver));
        BootstrapAlert.closeInfoNormal(driver);
        Assert.assertFalse(BootstrapAlert.isInfoNormalVisible(driver));
    }
}