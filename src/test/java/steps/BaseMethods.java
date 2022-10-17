package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethods {
    public static WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/{absolute path to chromedriver}/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
