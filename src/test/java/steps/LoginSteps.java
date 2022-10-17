package steps;

import io.qameta.allure.Step;

public class LoginSteps extends BaseMethods {
    @Step
    public void openLoginPage(String url) {
        driver.get(url);
    }
}