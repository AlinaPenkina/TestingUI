package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.MainPage;


public class MainPageSteps extends BaseMethods {
    MainPage mainPage = new MainPage();

    @Step("Get sliders quantity")
    public int getNumberOfSlides() {
        return driver.findElements(mainPage.SLIDER_DOT_BUTTON).size();
    }

    @Step("Select slider")
    public void clickOnSliderDotButton(int i) {
        driver.findElements(mainPage.SLIDER_DOT_BUTTON).get(i).click();
    }

    @Step("Click on button in slider")
    public void clickOnButtonInSlider() {
        WebElement sliderButton = driver.findElement(mainPage.SLIDER_BUTTON);
        Actions actions = new Actions(driver);
        actions.moveToElement(sliderButton, 10, 15).click();
    }

    @Step("Assert error not visible")
    public void checkErrorPageIsNotVisible() {
        Assert.assertTrue(driver.findElements(mainPage.ERROR_PAGE).isEmpty());
    }
}
