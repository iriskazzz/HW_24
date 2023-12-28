package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private SelenideElement
            moreButton = $(id("org.wikipedia.alpha:id/menu_icon")),
            logInButton = $(id("org.wikipedia.alpha:id/main_drawer_login_button"));

    public MainPage clickOnMoreButton() {
        moreButton.click();
        return this;
    }

    public MainPage clickOnLogInButton() {
        logInButton.click();
        return this;
    }

}
