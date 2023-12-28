package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class LoginPage {
    private ElementsCollection fieldLogin = $$(AppiumBy.className("android.widget.EditText"));

    private SelenideElement
            nextButton = $(id("org.wikipedia.alpha:id/create_account_submit_button")),
            logInButton = $(id("org.wikipedia.alpha:id/create_account_login_button"));

    public LoginPage checkFieldLogin(String fieldName) {
        fieldLogin.findBy(text(fieldName)).shouldBe(visible);
        return this;
    }

    public LoginPage checkNextButton() {
        nextButton.shouldBe(visible);
        return this;
    }

    public LoginPage checkLogInButton() {
        logInButton.shouldBe(visible);
        return this;
    }

}
