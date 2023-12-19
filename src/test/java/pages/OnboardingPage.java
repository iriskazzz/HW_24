package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {
  private SelenideElement headingLabelFirst = $(id("org.wikipedia.alpha:id/option_label")),
          headingLabelSecond = $(id("org.wikipedia.alpha:id/primaryTextView")),
          headingLabelThird = $(id("org.wikipedia.alpha:id/primaryTextView")),
          headingLabelFourth = $(id("org.wikipedia.alpha:id/primaryTextView")),
          continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));


  public OnboardingPage checkHeadingLabelFirst(String headingLabelFirstText) {
    headingLabelFirst.shouldHave(text(headingLabelFirstText));
    return this;
  }

  public OnboardingPage continueButtonClick() {
    continueButton.click();
    return this;
  }

  public OnboardingPage checkHeadingLabelSecond(String headingLabelSecondText) {
    headingLabelSecond.shouldHave(text(headingLabelSecondText));
    return this;
  }

  public OnboardingPage checkHeadingLabelThird(String headingLabelThirdText) {
    headingLabelThird.shouldHave(text(headingLabelThirdText));
    return this;
  }

  public OnboardingPage checkHeadingLabelFourth(String headingLabelFourthText) {
    headingLabelFourth.shouldHave(text(headingLabelFourthText));
    return this;
  }

}
