package pageObjects;

import org.openqa.selenium.By;
import steps.BaseMethods;

public class MainPage extends BaseMethods {
    public By SLIDER_BUTTON = By.xpath("//a[contains(@class, 'btn')]");
    public By SLIDER_DOT_BUTTON = By.xpath("//li[contains(@class, 'ng-star-inserted')]");
    public By ERROR_PAGE = By.xpath("//h3[contains(@class, 'error-page')]");
}