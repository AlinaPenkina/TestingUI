package tests;

import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.BaseMethods;
import steps.LoginSteps;
import steps.MainPageSteps;

import java.text.MessageFormat;

import static utils.Constants.PASSWORD;
import static utils.Constants.USERNAME;

public class SliderTest extends BaseMethods {
    LoginSteps loginSteps = new LoginSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();

    @BeforeClass
    public void installDriver() {
        setUp();
        String url = MessageFormat.format("https://{0}:{1}@test.werush.co/", USERNAME, PASSWORD);
        loginSteps.openLoginPage(url);
    }

    @Test
    @Description("Checking slider buttons don't return 404 error")
    public void checkSliderButtons() {
        int size = mainPageSteps.getNumberOfSlides();
        int i = 0;
        while (i < size) {
            mainPageSteps.clickOnSliderDotButton(i);
            mainPageSteps.clickOnButtonInSlider();
            mainPageSteps.checkErrorPageIsNotVisible();
            i++;
        }
    }

    @AfterClass
    public void closeDriver() {
        tearDown();
    }
}