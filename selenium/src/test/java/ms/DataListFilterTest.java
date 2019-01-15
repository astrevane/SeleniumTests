package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataListFilterTest
{
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(DataListFilter.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void testFilter() {
        Assert.assertTrue(DataListFilter.searchForPerson(driver, "Arman Cheyia"));
        Assert.assertTrue(DataListFilter.searchForPerson(driver, "Tyreese Burn"));
        DataListFilter.filterPersonByName(driver, "Tyreese Burn");
        Assert.assertFalse(DataListFilter.searchForPerson(driver, "Arman Cheyia"));
        Assert.assertTrue(DataListFilter.searchForPerson(driver, "Tyreese Burn"));
    }

}