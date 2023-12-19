package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.OnboardingPage;
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
  private OnboardingPage onboardingPage = new OnboardingPage();

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
      onboardingPage.checkHeadingLabelFirst("1.  English")
              .continueButtonClick();

    });
    step("Check 2 page", () -> {
      onboardingPage.checkHeadingLabelSecond("New ways to explore")
              .continueButtonClick();
    });
    step("Check 3 page", () -> {
      onboardingPage.checkHeadingLabelThird("Reading lists with sync")
              .continueButtonClick();
    });
    step("Check 4 page", () -> {
      onboardingPage.checkHeadingLabelFourth("Send anonymous data");
    });
  }

}
