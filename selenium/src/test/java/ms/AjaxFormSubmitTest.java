package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;






public class AjaxFormSubmitTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(AjaxFormSubmit.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testAjax() {
        AjaxFormSubmit.setInputName(driver, "my name");
        AjaxFormSubmit.setInputComment(driver, "my comment");
        Assert.assertTrue(AjaxFormSubmit.isSubmitButtonVisible(driver));
        AjaxFormSubmit.clickSubmit(driver);
        Driver.waitFor(1000);
        Assert.assertFalse(AjaxFormSubmit.isSubmitButtonVisible(driver));
        for (int i = 0; i < 5; ++i) {
            if (!"Ajax Request is Processing!".equals(AjaxFormSubmit.getStatusMessage(driver))) {
                break;
            } else {
                Driver.waitFor(2000);
            }
        }
        Assert.assertEquals("Form submited Successfully!", AjaxFormSubmit.getStatusMessage(driver));
    }


}