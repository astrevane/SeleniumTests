package ms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


final public class Driver {
    static private Boolean initialized = false;
    static private WebDriver driver = null;
    static public WebDriver getDriver() {
        if (!initialized) {
            initialized = true;
            System.setProperty("webdriver.gecko.driver", "/home/astrevane/java/geckodriver");            
        }
        driver = new FirefoxDriver();
        driver.manage().window().maximize();  
        return driver;
    }
    static public void waitFor(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();            
        }
    }
    static public void close(long ms) {
        if (ms > 0) {
            waitFor(ms);
        }
        driver.quit();
        driver = null;
    }
}


