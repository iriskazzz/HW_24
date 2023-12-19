package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class VikiPage {
  private SelenideElement errorText = $(id("org.wikipedia.alpha:id/view_wiki_error_text")),
          errorButton = $(id("org.wikipedia.alpha:id/view_wiki_error_button"));


  public VikiPage checkErrorText(String valueErrorText) {
    errorText.shouldHave(text(valueErrorText));

    return this;
  }

  public VikiPage checkErrorButton(String errorButtonName) {
    errorButton.shouldHave(text(errorButtonName));
    return this;
  }

}
