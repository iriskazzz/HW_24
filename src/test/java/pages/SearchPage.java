package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {
  private SelenideElement firstSearch = $(accessibilityId("Search Wikipedia")),
          secondSearch = $(id("org.wikipedia.alpha:id/search_src_text"));


  public SearchPage clickOnFirstSearch() {
    firstSearch.click();
    return this;
  }

  public SearchPage clickOnSecondSearch(String value) {
    secondSearch.sendKeys(value);
    return this;
  }

}
