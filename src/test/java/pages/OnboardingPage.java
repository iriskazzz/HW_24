package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {
    private SelenideElement primaryText = $(id("org.wikipedia.alpha:id/primaryTextView")),
            secondaryText = $(id("org.wikipedia.alpha:id/secondaryTextView")),
            optionLabel = $(id("org.wikipedia.alpha:id/option_label")),
            languageButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
            rejectButton = $(id("org.wikipedia.alpha:id/rejectButton")),
            acceptButton = $(id("org.wikipedia.alpha:id/acceptButton")),
            continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));


    public OnboardingPage checkPrimaryText(String primaryTextLabel) {
        primaryText.shouldHave(text(primaryTextLabel));
        return this;
    }

    public OnboardingPage checkSecondaryText(String secondaryTextLabel) {
        secondaryText.shouldHave(text(secondaryTextLabel));
        return this;
    }

    public OnboardingPage checkOptionLabel(String optionLabelText) {
        optionLabel.shouldHave(text(optionLabelText));
        return this;
    }

    public OnboardingPage checkLanguageButtonText(String languageButtonText) {
        languageButton.shouldHave(text(languageButtonText));
        return this;
    }

    public OnboardingPage checkRejectButtonText(String rejectButtonText) {
        rejectButton.shouldHave(text(rejectButtonText));
        return this;
    }

    public OnboardingPage checkAcceptButtonText(String acceptButtonText) {
        acceptButton.shouldHave(text(acceptButtonText));
        return this;
    }

    public OnboardingPage continueButtonClick() {
        continueButton.click();
        return this;
    }

}
