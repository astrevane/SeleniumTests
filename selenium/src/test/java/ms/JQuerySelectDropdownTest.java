package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;




public class JQuerySelectDropdownTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(JQuerySelectDropdown.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testSelectCountry() {
        Assert.assertEquals("", JQuerySelectDropdown.getSelectedCountry(driver));
        JQuerySelectDropdown.selectCountry(driver, "South Africa");
        Assert.assertEquals("South Africa", JQuerySelectDropdown.getSelectedCountry(driver));
        JQuerySelectDropdown.selectCountry(driver, "Denmark");
        Assert.assertEquals("Denmark", JQuerySelectDropdown.getSelectedCountry(driver));
    }
    @Test
    public void testSelectStates() {
        JQuerySelectDropdown.selectStates(driver, "Idaho", "Maine", "Nevada");
        Assert.assertTrue(JQuerySelectDropdown.isInSelectedStates(driver, "Idaho"));
        Assert.assertTrue(JQuerySelectDropdown.isInSelectedStates(driver, "Maine"));
        Assert.assertTrue(JQuerySelectDropdown.isInSelectedStates(driver, "Nevada"));
    }
    @Test
    public void testSelectTerritory() {
        JQuerySelectDropdown.selectTerritory(driver, "Puerto Rico");
        Assert.assertEquals("Puerto Rico", JQuerySelectDropdown.getSelectedTerritory(driver));
        JQuerySelectDropdown.selectTerritory(driver, "Virgin Islands");
        Assert.assertEquals("Virgin Islands", JQuerySelectDropdown.getSelectedTerritory(driver));
        JQuerySelectDropdown.selectTerritory(driver, "Guam");
        Assert.assertEquals("Virgin Islands", JQuerySelectDropdown.getSelectedTerritory(driver));
    }

    @Test
    public void testSelectLanguage() {
        JQuerySelectDropdown.selectLanguage(driver, "Programming languages", "Java");
        JQuerySelectDropdown.selectLanguage(driver, "Scripting languages", "Ruby");
        JQuerySelectDropdown.selectLanguage(driver, "Other", "Unknown Script");
    }
}