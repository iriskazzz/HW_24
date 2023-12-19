package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.SearchPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class AndroidSearchTests extends TestBase {

  private SearchPage searchPage = new SearchPage();
  private SearchResultPage searchResult = new SearchResultPage();
  private ArticlePage articlePage = new ArticlePage();

  private final static String SEARCH_VALUE = "Appium";
  private final static String ERROR_TEXT_VALUE = "An error occurred";
  private final static String ERROR_BUTTON_NAME = "GO BACK";


  @Test
  @Tag("browserstack")
  @DisplayName("Проверка отображения сообщения об ошибке на странице Википедии")
  void checkErrorTextTest() {
    step("Ввод значения Appium в строку поиска", () -> {
              searchPage.clickOnFirstSearch()
                      .clickOnSecondSearch(SEARCH_VALUE);
    });
    step("Клик по строке поиска с содержанием текста введенного запроса", () -> {
              searchResult.clickOnLineSearch(SEARCH_VALUE);
            }
    );
    step("Проверка видимости сообщения об ошибке", () -> {
              articlePage.checkErrorText(ERROR_TEXT_VALUE)
                      .checkErrorButton(ERROR_BUTTON_NAME);
            }
    );
  }


  @Test
  @Tag("emulator")
  void searchTests() {
    step("Check 1 page", () -> {
      $(id("org.wikipedia.alpha:id/option_label")).shouldHave(text("1.  English"));
      $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    });
    step("Check 2 page", () -> {
      $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
      $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    });
    step("Check 3 page", () -> {
      $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
      $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    });
    step("Check 3 page", () -> {
      $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data"));
    });
  }

}
