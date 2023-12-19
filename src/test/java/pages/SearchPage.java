package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {
  private SelenideElement firstSearch = $(accessibilityId("Search Wikipedia")),
          secondSearch = $(id("org.wikipedia.alpha:id/search_src_text")),
          lineSearch = $(id("org.wikipedia.alpha:id/page_list_item_title"));
  private ElementsCollection linesSearch = $$(id("org.wikipedia.alpha:id/page_list_item_title"));


  public SearchPage clickOnFirstSearch() {
    firstSearch.click();
    return this;
  }

  public SearchPage clickOnSecondSearch(String value) {
    secondSearch.sendKeys(value);
    return this;
  }

  public SearchPage clickOnLineSearch(String value) {
    lineSearch.shouldHave(text(value)).click();
    return this;
  }

  public SearchPage checkNotNull() {
    linesSearch.shouldHave(sizeGreaterThan(0));
    return this;
  }
}
