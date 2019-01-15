package ms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class SelectDropdownListTest {
    WebDriver driver = null;
    @Before
    public void before() {
        driver = Driver.getDriver();   
        driver.get(SelectDropdownList.URL);
    }
    @After
    public void after() {
        Driver.close(2000);
        driver = null;
    }
    @Test
    public void selectDay() {
        SelectDropdownList.selectFromList(driver, "Friday");
        Assert.assertEquals("Day selected :- Friday", SelectDropdownList.getDaySelectedMessage(driver));
    }
    @Test
    public void selectStates() {
        SelectDropdownList.selectMultipleFromList(driver, "Ohio", "Texas", "Florida");
        SelectDropdownList.clickForFirstSelected(driver);
        Assert.assertEquals("First selected option is : Ohio", SelectDropdownList.getStatesSelectedMessage(driver));
        SelectDropdownList.clickForAllSelected(driver);
        Assert.assertEquals("Options selected are : Ohio,Texas,Florida", SelectDropdownList.getStatesSelectedMessage(driver));
    }


}