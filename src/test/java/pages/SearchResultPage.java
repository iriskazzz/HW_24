package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultPage {
  private SelenideElement lineSearch = $(id("org.wikipedia.alpha:id/page_list_item_title"));
  private ElementsCollection linesSearch = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

  public SearchResultPage clickOnLineSearch(String value) {
    lineSearch.shouldHave(text(value)).click();
    return this;
  }

  public SearchResultPage checkNotNull() {
    linesSearch.shouldHave(sizeGreaterThan(0));
    return this;
  }
}
